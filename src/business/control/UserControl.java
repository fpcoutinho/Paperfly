package business.control;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import business.model.User;

public class UserControl {
    static ArrayList<User> users;

    public UserControl(String caminhoArquivo) { //caminhoArquivo seria algo do tipo "D:\\arquivo.txt"
        try {
            FileReader abrirArq = new FileReader(caminhoArquivo);
            BufferedReader lerArq = new BufferedReader(abrirArq);

            while (lerArq.ready()) {
                String linha = lerArq.readLine();
                this.users.add(linha);
            }

            abrirArq.close();
            lerArq.close();
        } catch (IOException e) {
            System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
    }

    public static void addUser(User u){
        users.add(u);
    }

    public static String listAll(){
        String lista = "";
        for (User u:users) lista += u + "\n";
        return lista;
    }

    public static String list(String login) throws Exception{
        for (User u:users)
            if (u.getLogin().matches(login))
                return u.toString();

        throw new userNotFoundException();
    }

    public static boolean deleteUser(String login) throws Exception{
        for (int i = 0; i < users.size() ; i++)
            if (users.get(i).getLogin().matches(login)) {
                users.remove(i);
                return true;
            }
        throw new userNotFoundException();
    }

    public static class userNotFoundException extends Exception{
        @Override
        public String getMessage(){
            return "Usuário não encontrado.";
        }
    }
}