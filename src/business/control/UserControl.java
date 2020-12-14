package business.control;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;
import business.exception.UserNotFoundException;
import business.model.User;
import infra.UserDAO;

public class UserControl {
    ArrayList<User> users;
    String filePath;
    Iterator<User> it;

    public UserControl(){}

    public UserControl(String caminhoArquivo) { //caminhoArquivo seria algo do tipo "D:\\arquivo.txt"
        try {
            filePath = caminhoArquivo;
            this.users = UserDAO.lerUsers(caminhoArquivo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setFilePath(String filePath) {
        try {
            this.filePath = filePath;
            this.users = UserDAO.lerUsers(filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addUser(User user){
        this.users.add(user);
        try{
            UserDAO.salvaUsers(this.users, filePath);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public String listAll(){
        String lista = "";
        for (User user:this.users)
            lista = lista.concat(user.toString()+ "\n");

        return lista;
    }

    public String list(String login) throws Exception{
        it = users.iterator();
        User u;
        while(it.hasNext()) {
            u = (User)it.next();
            if (u.getLogin().matches(login))
                return u.toString();
        }
        throw new UserNotFoundException();
    }

    //  lista os usuários por login em ordem alfabética crescente
    public TreeSet<User> listUsersOrderByLogin() {
        SortedSet listOrdered = new TreeSet();
        listOrdered.addAll(this.users);
        return (TreeSet<User>) listOrdered;
    }

    public boolean deleteUser(String login) throws Exception{
        it = users.iterator();
        User u;
        while(it.hasNext()) {
            u = (User)it.next();
            if (u.getLogin().matches(login)) {
                it.remove();
                UserDAO.salvaUsers(this.users, filePath);
                return true;
            }
        }
        throw new UserNotFoundException();
    }
}