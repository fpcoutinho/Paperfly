package business.control;
import java.util.ArrayList;
import business.model.User;
import infra.UserDAO;

public class UserControl {
    ArrayList<User> users;
    String filePath;

    public UserControl(String caminhoArquivo) { //caminhoArquivo seria algo do tipo "D:\\arquivo.txt"
        try {
            filePath = caminhoArquivo;
            this.users = UserDAO.lerUsers(caminhoArquivo);
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
        for (User user:this.users) lista += user + "\n";
        return lista;
    }

    public String list(String login) throws Exception{
        for (User user:this.users)
            if (user.getLogin().matches(login))
                return user.toString();

        throw new userNotFoundException();
    }

    public boolean deleteUser(String login) throws Exception{
        for (int i = 0; i < this.users.size() ; i++)
            if (this.users.get(i).getLogin().matches(login)) {
                this.users.remove(i);
                UserDAO.salvaUsers(this.users, filePath);
                return true;
            }
        throw new userNotFoundException();
    }

    public class userNotFoundException extends Exception{
        @Override
        public String getMessage(){
            return "Usuário não encontrado.";
        }
    }
}