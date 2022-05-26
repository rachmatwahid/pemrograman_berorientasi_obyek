package collection;

import java.util.HashMap;

public class LearnHashMap {
    public static void main(String[] args) {

        HashMap<String, Student> class3C = new HashMap<>();

        class3C.put("1A", new Student("Adinda"));
        class3C.put("2B", new Student("Bambang"));
        class3C.put("3C", new Student("Chintya"));

        for (String studentID: class3C.keySet()) {
            System.out.println(studentID);
        }

        for (Student student: class3C.values()) {
            System.out.println(student.getName());
        }
    }
}
