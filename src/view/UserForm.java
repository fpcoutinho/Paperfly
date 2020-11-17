package view;
import business.control.Validate;
import business.model.User;


public class UserForm implements SignUp {
    String usuario, senha;
    public UserForm(String login, String password) {
        this.usuario = login;
        this.senha = password;
    }
    @Override
    public User Register() {
        try {
            Validate.checkLogin(usuario);
            Validate.checkPassword(senha);
        } catch (Exception e) {
            e.printStackTrace();
        }
        User u = new User(usuario, senha);
        return u;
    }
}
