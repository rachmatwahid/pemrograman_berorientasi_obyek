package generic;

public class Student implements Comparable<Student>{

    private String ID;
    private String name;

    Student(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.ID.compareTo(o.ID);
    }
}
