package business.control;
import java.lang.Character;

public class Validate {

    //checando se o nome do usuário é válido
    public static void checkLogin(String login) throws Exception{
        if (login.length() == 0){
            throw new excecaoLoginEmpty();
        }
        else if (login.length() > 20){
            throw new excecaoLoginLength();
        }
        //checando se a string contem numeros
        else if (login.matches(".*\\d.*")) {
            throw new excecaoLoginNumbers();
        }
    }

    //checando se a senha do usuário é válida
    public static void checkPassword(String senha) throws Exception{
        if(!(senha.length() >= 8 && senha.length() <= 12)){
            throw new excecaoPasswordLength();
        }
        else if(!contem2Numeros(senha)){
            throw new excecaoInvalidPassword();
        }
    }

    public static boolean contem2Numeros(String senha){
        int numbercount = 0;
        for (int i = 0 ; i < senha.length() ; i++){
            //checando se o caractere não é letra ou numero
            if(!Character.isLetterOrDigit(senha.charAt(i))){
                return false;
            }
            if(Character.isDigit(senha.charAt(i))){
                numbercount++;
            }
        }
        return (numbercount >= 2 && numbercount < senha.length());
    }

    //definindo Exceções Próprias

    public static class excecaoLoginLength extends Exception{
        @Override
        public String getMessage(){
            return "Nome de usuario nao pode possuir mais de 20 caracteres.";
        }
    }
    public static class excecaoLoginEmpty extends Exception{
        @Override
        public String getMessage(){
            return "Nome de usuario nao pode ser vazio.";
        }
    }
    public static class excecaoLoginNumbers extends Exception{
        @Override
        public String getMessage(){
            return "Nome de usuario nao pode possuir caracteres numericos.";
        }
    }
    public static class excecaoPasswordLength extends Exception{
        @Override
        public String getMessage(){
            return "Senha deve possuir entre 8 e 12 caracteres.";
        }
    }
    public static class excecaoInvalidPassword extends Exception{
        @Override
        public String getMessage(){
            return "Senha deve possuir somente letras e numeros, e ao menos 2 números.";
        }
    }
}
