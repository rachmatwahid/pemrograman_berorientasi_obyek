package generic;

import java.util.Arrays;

public class LearnComparable {
    public static void main(String[] args) {

        Student[] students = {
                new Student("4F3", "John"),
                new Student("AB1", "Jane"),
                new Student("55X", "Joe")
        };

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));
    }
}
