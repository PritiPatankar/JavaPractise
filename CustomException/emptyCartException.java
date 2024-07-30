package CustomException;

public class emptyCartException extends Exception{
    emptyCartException(String ExceptionMsg){
        super(ExceptionMsg);
    }
}
