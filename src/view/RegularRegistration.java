package view;

public class RegularRegistration implements SignUp {
    String usuario, senha;
    public RegularRegistration(String login, String password) {
        this.usuario = login;
        this.senha = password;
    }
    @Override
    public void Register() {
    }
}
