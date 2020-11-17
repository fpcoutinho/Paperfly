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
    public void Register() {
        try {
            Validate.checkLogin(usuario);
            Validate.checkPassword(senha);
            User u = new User(usuario, senha);
            //codigo para add usuario no banco de dados vai aqui!
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
