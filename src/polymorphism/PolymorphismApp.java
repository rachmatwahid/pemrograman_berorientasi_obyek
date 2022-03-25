package polymorphism;

public class PolymorphismApp {
    public static void main(String[] args) {
//        Triangle myTriangle = new Triangle();
//        System.out.println(myTriangle.getClassName());
//        System.out.println(myTriangle.getParentClassName());
//        System.out.println(myTriangle.area());
//        System.out.println(myTriangle.area(4, 5));

//        Shape shapeRef;
//        shapeRef = new Triangle();
//        System.out.println(shapeRef.getClassName());

        Shape triRef, isoRef;
        triRef = new Triangle();
        System.out.println(triRef.getClassName());
        isoRef = new Isosceles();
        System.out.println(isoRef.getClassName());
    }
}
