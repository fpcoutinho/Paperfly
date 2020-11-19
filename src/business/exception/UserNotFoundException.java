package business.exception;

public class UserNotFoundException extends Exception {
    @Override
    public String getMessage(){
        return "Usuário não encontrado.";
    }
}
