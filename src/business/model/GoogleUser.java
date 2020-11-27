package business.model;
import java.io.Serializable;

public abstract class GoogleUser implements Serializable, Comparable<GoogleUser> {
    String id_token, access_token;
    public GoogleUser(String id_token, String access_token) {
        this.id_token = id_token;
        this.access_token = access_token;
    }

    public String getID() {
        return this.id_token;
    }

    @Override
    public int compareTo(GoogleUser user) {
        return this.id_token.compareTo(user.id_token);
    }
}
