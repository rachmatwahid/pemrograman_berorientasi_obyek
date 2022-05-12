public class DataType {
    public static void main(String[] args) {

        // Variable and Data Type
        byte quantity = 9;
        short numberOfPages = 299;
        int bookPrice = 175000;
        long stockInWarehouse = 15000000000L;

        float discount = .1f;
        double PI = 3.1415926535d;

        boolean isAvailable = true;

        char paperQualityGrade = 'A';
        String title = "Harry Potter and The Chamber of Secrets";


        // Assignment
        bookPrice = 120000;
        final String paperSize = "A4";
        // paperSize = "F4"; // Uncomment this
        System.out.println(paperSize);


        // Casting
        int oneDigit = 7;
        double twoDigit = oneDigit;

        double anotherTwoDigit = 9.0;
        int anotherOneDigit = (int) anotherTwoDigit;


        // Operator
        int sum1 = 1 + 2;
        int sum2 = sum1 + 3;
        int sum3 = sum1 + sum2;

        // Arithmetic Operator
        int x = 2;
        int y = 1;
        int addition = x + y;
        int substraction = x - y;
        int multiplication = x * y;
        float division = x / y;
        int modulus = x % y;
        int xPlusOne = x++;
        int xMinusOne = y--;

        // String Concatenation
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + lastName);

        int number = 7;
        String word = "Eleven";
        System.out.println(number + word);

        // Assignment Operator
        int five = 5;
        five += 1;
        five -= 3;
        five *= 2;
        five /= 2;

        // Comparison Operator
        int johnAge = 17;
        int janeAge = 15;

        // Logical Operator
        boolean isTrue = true;
        System.out.println(isTrue && false);

        //System.out.println(johnAge == janeAge);
    }
}
