package exception;

public class TryCatchEHandling {
    public static void main(String[] args) {
        try {
            int number = 1/0;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
