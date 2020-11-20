package business.exception;

public class DataInvalidException extends Exception {
    @Override
    public String getMessage(){
        return "Data de nascimento invalida.";
    }
}
