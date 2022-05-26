package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {

        TreeSet<String> courses = new TreeSet<String>();

        courses.add("Math");
        courses.add("Physics");
        courses.add("Computer");

        Iterator<String> iterate = courses.iterator();

        while(iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }
}
