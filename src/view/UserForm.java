package view;
import business.control.Validate;
import business.model.User;
import business.model.Data;


public class UserForm implements SignUp {
    String usuario, senha;
    Data data_nascimento;
    public UserForm(String login, String password, int dia, int mes, int ano) {
        this.usuario = login;
        this.senha = password;
        this.data_nascimento.setDay(dia);
        this.data_nascimento.setMonth(mes);
        this.data_nascimento.setYear(ano);
    }
    @Override
    public User Register() {
        try {
            Validate.checkLogin(usuario);
            Validate.checkPassword(senha);
            Validate.checkData(data_nascimento.getData())
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new User(usuario, senha);
    }
}
