package view;

import business.control.Validate;
import business.model.Data;
import business.model.User;
import business.model.Manager;


public class ManagerForm implements SignUpForm {
    String usuario, senha;
    Data data_nascimento;
    public ManagerForm(String login, String password, int dia, int mes, int ano) {
        this.usuario = login;
        this.senha = password;
        this.data_nascimento = new Data(dia, mes, ano);
    }
    @Override
    public User Register() {
        try {
            Validate.checkLogin(usuario);
            Validate.checkPassword(senha);
            Validate.checkData(data_nascimento.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Manager(usuario, senha);
    }
}
