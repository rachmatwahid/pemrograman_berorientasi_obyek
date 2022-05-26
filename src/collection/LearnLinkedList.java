package collection;

import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {

        LinkedList<Student> class2B = new LinkedList<Student>();

        class2B.add(new Student("Ari"));
        class2B.add(new Student("Bima"));
        class2B.add(new Student("Chika"));

        for (Student student: class2B) {
            System.out.println(student.getName());
        }
    }
}
