public class ControlFlow {
    public static void main(String[] args) {

        // Expression
        int price;
        price = 1000;


        // Statement
        int age = 17;
        age++;
        //System.out.println(age);


        // If Statement
        int grade = 40;
        if (grade <= 40) {
            System.out.println("Poor");
        }


        // If-else Statement
        if (grade > 40) {
            System.out.println("Good");
        } else {
            System.out.println("Poor");
        }


        // Else-if Statement
        grade = 75;
        if (grade > 70) {
            System.out.println("Well done");
        } else if (grade > 50) {
            System.out.println("Good");
        } else {
            System.out.println("Poor");
        }

        int time = 20;
        String result = (time < 18) ? "Good day" : "Good evening";
        System.out.println(result);


        // Switch Statement
        char letterGrade = 'C';
        switch (letterGrade) {
            case 'A':
                System.out.println("Wonderful");
                break;
            case 'B':
                System.out.println("Nice");
                break;
            case 'C':
            case 'D':
                System.out.println("Too bad");
                break;
            default:
                System.out.println("Invalid");
        }


        // For Statement
        for (int i = 1; i <= 10; i++) {
            System.out.println("Jump");
        }

        int counter = 1;
        while (counter <= 5) {
            System.out.println("Run");
            counter++;
        }
    }
}
