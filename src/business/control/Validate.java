package business.control;

import business.exception.*;

import java.lang.Character;

public class Validate {

    //checando se o nome do usuário é válido
    public static void checkLogin(String login) throws Exception{
        if (login.length() == 0){
            throw new LoginEmptyException();
        }
        else if (login.length() > 20){
            throw new LoginLengthException();
        }
        //checando se a string contem numeros
        else if (login.matches(".*\\d.*")) {
            throw new LoginNumbersException();
        }
    }

    //checando se a senha do usuário é válida
    public static void checkPassword(String senha) throws Exception{
        if(!(senha.length() >= 8 && senha.length() <= 12)){
            throw new PasswordLengthException();
        }
        else if(!contem2Numeros(senha)){
            throw new PasswordInvalidException();
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
}
