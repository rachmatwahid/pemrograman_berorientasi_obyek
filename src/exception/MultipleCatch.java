package exception;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int number = 1/0;
        } catch (ArithmeticException e) {
            System.out.println("Math wrong!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of Array!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
