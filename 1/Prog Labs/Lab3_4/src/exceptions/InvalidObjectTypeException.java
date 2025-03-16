package exceptions;

public class InvalidObjectTypeException extends RuntimeException{
    public InvalidObjectTypeException(String message){
        super(message);
    }
}
