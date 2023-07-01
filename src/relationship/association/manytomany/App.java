package relationship.association.manytomany;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe");
        Student student2 = new Student("Jane Smith");

        Course course1 = new Course("Programming");
        Course course2 = new Course("UI Design");

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
    }
}
