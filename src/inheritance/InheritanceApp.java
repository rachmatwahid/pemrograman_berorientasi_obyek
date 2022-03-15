package inheritance;

public class InheritanceApp {
    public static void main(String[] args) {
        Quadrilateral mySquare = new Quadrilateral();
        System.out.println(mySquare.getClassName());
        System.out.println(mySquare.side);
        System.out.println(mySquare.getParentSimpleName());
        System.out.println(mySquare.name);
        System.out.println(mySquare.toString());
    }
}
