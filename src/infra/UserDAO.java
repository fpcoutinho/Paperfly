package infra;
import business.model.User;
import java.io.*;
import java.util.ArrayList;

public class UserDAO {

    public static void salvaUsers(ArrayList<User> users, String filePath) throws Exception {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(users);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException exception) {
            throw new IOException("Erro ao salvar usuário!", exception);
        }
    }


    public static ArrayList<User> lerUsers(String path) throws Exception {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<User> users = (ArrayList<User>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return users;
        } catch (IOException exception) {
            throw new IOException("Erro ao ler usuários!", exception);
        }
    }
}
