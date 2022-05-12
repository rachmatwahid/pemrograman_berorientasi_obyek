package inheritance;

public class InheritanceApp {
    public static void main(String[] args) {
        Quadrilateral mySquare = new Quadrilateral("White");
        System.out.println(mySquare.sides);
        System.out.println(mySquare.getDimension());
        System.out.println(mySquare.getParentClassName());
        System.out.println(mySquare.dimensions);
        System.out.println(mySquare.getClassName());
        System.out.println(mySquare.toString());

        Shape myShape = new Shape("White");
        Shape.Line myLine = myShape.new Line();
    }
}
