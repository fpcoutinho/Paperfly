package business.control;
import java.util.ArrayList;
import business.model.User;

public class UserControl {
    static ArrayList<User> users;
    //talvez seja melhor passar o nome do arquivo no construtor, ler o arquivo, extrair a lista de usuarios e atribuir a users.
    public UserControl(){
        users = new ArrayList<User>();
    }

    public static void addUser(User u){
        users.add(u);
    }
    public static String listAll(){
        String lista = "";
        for (User u:users) lista += u + "\n";
        return lista;
    }
    public static String list(String login) throws Exception{
        for (User u:users)
            if (u.getLogin().matches(login))
                return u.toString();

        throw new userNotFoundException();
    }

    public static boolean deleteUser(String login) throws Exception{
        for (int i = 0; i < users.size() ; i++)
            if (users.get(i).getLogin().matches(login)) {
                users.remove(i);
                return true;
            }
        throw new userNotFoundException();
    }

    public static class userNotFoundException extends Exception{
        @Override
        public String getMessage(){
            return "Usuário não encontrado.";
        }
    }
}