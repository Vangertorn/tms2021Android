package reader.exception;

public class IncorrectAmountException extends NumberFormatException{
    public IncorrectAmountException(String s) {
        super(s);
    }
}
