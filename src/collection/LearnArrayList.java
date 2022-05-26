package collection;

import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {

        ArrayList<Student> class1A = new ArrayList<>();

        class1A.add(new Student("Adi"));
        class1A.add(new Student("Bisma"));
        class1A.add(new Student("Cantika"));

        System.out.println(class1A);

        System.out.println(class1A.get(1));

        class1A.set(0, new Student("Aditya"));

        class1A.remove(2);

        for(Student student: class1A) {
            System.out.println(student.getName());
        }

        class1A.clear();
    }
}
