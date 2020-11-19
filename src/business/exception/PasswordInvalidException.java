package business.exception;

public class PasswordInvalidException extends Exception {
    @Override
    public String getMessage(){
        return "Senha deve possuir somente letras e numeros, e ao menos 2 números.";
    }

}
