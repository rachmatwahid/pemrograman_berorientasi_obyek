package exception;

public class InvalidAgeException extends Exception {
    private int number;
    InvalidAgeException(int number) {
        this.number = number;
    }
    public String getExceptionMessage() {
        return number + " is not a valid age";
    }
}
