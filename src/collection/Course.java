package collection;

public class Course implements Comparable<Course> {

    private String ID;
    private String name;

    Course(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    String getID() {
        return ID;
    }

    String getName() {
        return name;
    }

    @Override
    public int compareTo(Course c) {
        if (this.ID.equals(c.ID)) {
            return 1;
        } else {
            return 0;
        }
    }
}
