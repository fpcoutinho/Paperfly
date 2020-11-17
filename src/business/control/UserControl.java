package business.control;
import java.util.ArrayList;

public class UserControl {
    ArrayList<String> users;
    //talvez seja melhor passar o nome do arquivo no construtor, ler o arquivo, extrair a lista de usuarios e atribuir a users.
    public UserControl(){
        users = new ArrayList<String>();
    }

    public void deleteUser(String login){}
}