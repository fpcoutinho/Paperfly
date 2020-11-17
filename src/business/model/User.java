package business.model;
import java.io.Serializable;

public class User implements Serializable {
    String login, senha;
    public User(String user, String password){
        this.login = user;
        this.senha = password;
    }

    public String getLogin() {
        return login;
    }
}
