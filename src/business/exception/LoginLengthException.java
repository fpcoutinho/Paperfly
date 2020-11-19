package business.exception;

public class LoginLengthException extends Exception {
    @Override
    public String getMessage(){
        return "Nome de usuario nao pode possuir mais de 20 caracteres.";
    }
}
