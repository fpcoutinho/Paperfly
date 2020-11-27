package business.adapters;

import business.model.Data;
import business.model.User;
import business.model.GoogleUser;

public class GoogleLoginAdapter extends User {
    private GoogleUser user;
    private Data data_de_nascimento;

    public GoogleLoginAdapter(GoogleUser user, Data data) {
        this.user = user;
        this.data_de_nascimento = data;
    }

    @Override
    public String getLogin() { return this.user.getID(); }

    @Override
    public Data getData() { return this.data_de_nascimento; }
}
