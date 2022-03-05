public class Method {

    // Deklarasi method dasar
    static void greeting() {
        System.out.println("Good Morning!");
    }

    // Deklarasi method dengan parameter
    static void greetingWithName(String name) {
        System.out.println("Hi, " + name);
    }

    // Deklarasi method yang mengembalikan nilai
    static int countAge(int birthYear) {
        int age = 2022 - birthYear;
        return age;
    }


    // Method Overloading

    // Method dengan parameter bertipe int
    static void courseResult(int grade) {
        System.out.println("Your grade is " + grade);
    }

    // Method dengan parameter bertipe char
    static void courseResult(char grade) {
        System.out.println("You get " + grade);
    }


    public static void main(String[] args) {

        greeting(); // Pemanggilan method dasar

        greetingWithName("John"); // Pemanggilan method dengan parameter

        System.out.println(countAge(1997)); // Pemanggilan method yang mengembalikan nilai

        courseResult(90);
        courseResult('B');

        // Method scope
        //System.out.println(x); // Uncomment untuk melihat error
        int x = 100;
        System.out.println(x);

        {
            int y = 2;
            System.out.println(y);
        }
        // System.out.println(y);



    }

    // Comment

    /*
     * Get an area of a rectangle
     *
     * @param side length
     * @return area
     */
    static int rectangleArea(int sideLength) {
        return sideLength ^ 2 ; // side length times side length
    }
}
