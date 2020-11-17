package business.model;

public class User {
    String login, senha;
    public User(String user, String password){
        this.login = user;
        this.senha = password;
    }

    public String getLogin() {
        return login;
    }
}
