package business.model;
import java.io.Serializable;

public abstract class User implements Serializable, Comparable<User> {
    String login, senha;
    Data data_nascimento;

    public User() {}

    public User(String user, String password){
        this.login = user;
        this.senha = password;
    }

    public String getLogin() {
        return login;
    }

    public Data getData(){
        return data_nascimento;
    }

    @Override
    public int compareTo(User user) {
        return this.login.compareTo(user.login);
    }
}
