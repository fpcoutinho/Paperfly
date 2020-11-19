package business.exception;

public class LoginEmptyException extends Exception {
    @Override
    public String getMessage(){
        return "Nome de usuario nao pode ser vazio.";
    }
}
