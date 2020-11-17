package infra;
import business.model.User;
import java.io.*;
import java.util.ArrayList;

public class UserDAO {

    public static void salvaUsers(ArrayList<User> users, String filePath) throws Exception {
        FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(users);
        oos.flush();
        oos.close();
        fos.close();
    }


    public static ArrayList<User> lerUsers(String path) throws Exception {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<User> users = (ArrayList<User>) ois.readObject();
        ois.close();
        fis.close();
        return users;
    }
}
