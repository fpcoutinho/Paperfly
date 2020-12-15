package view;

import business.model.Data;

public class ManagerFormBuilder implements Builder {
    private String usuario;
    private String senha;
    private Data dataNascimento;

    @Override
    public void setUsuario(String login) {
        this.usuario = login;
    }

    @Override
    public void setLogin(String password) {
        this.senha = password;
    }

    @Override
    public void setData(int dia, int mes, int ano) {
        this.dataNascimento = new Data(dia, mes, ano);
    }

    public ManagerForm getResult() {
        return new ManagerForm(usuario,senha, dataNascimento);
    }
}
