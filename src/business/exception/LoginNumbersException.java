package business.exception;

public class LoginNumbersException extends Exception {
    @Override
    public String getMessage(){
        return "Nome de usuario nao pode possuir caracteres numericos.";
    }
}
