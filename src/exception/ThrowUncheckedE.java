package exception;

public class ThrowUncheckedE {
    static void isAgeValid(byte age) {
        if (age < 1 || age > 100) {
            throw new ArithmeticException("Wrong age!");
        } else {
            System.out.println("Age valid!");
        }
    }

    public static void main(String[] args) {
        byte age = 0;
        isAgeValid(age);
    }
}
