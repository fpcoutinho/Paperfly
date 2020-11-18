package infra;
import business.model.User;
import java.io.*;
import java.util.ArrayList;

public class UserDAO {

    public static void salvaUsers(ArrayList<User> users, String filePath) throws Exception {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(users);
            oos.flush();
            oos.close();
            fos.close();
        } catch (IOException exception) {
            throw new IOException("Erro ao salvar usuário!", exception);
        }
    }


    public static ArrayList<User> lerUsers(String path) throws Exception {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<User> users = (ArrayList<User>) ois.readObject();
            ois.close();
            fis.close();
            return users;
        } catch (IOException exception) {
            throw new IOException("Erro ao ler usuários!", exception);
        }
    }
}
