package business.exception;

public class PasswordLengthException extends Exception {
    @Override
    public String getMessage(){
        return "Senha deve possuir entre 8 e 12 caracteres.";
    }
}
