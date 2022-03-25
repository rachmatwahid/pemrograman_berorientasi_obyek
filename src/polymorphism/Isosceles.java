package polymorphism;

public class Isosceles extends Triangle {
    Isosceles() {
        super();
        System.out.println("Isosceles Class Created");
    }

    final String getClassName() {
        return "Isosceles Class";
    }

    final String getParentClassName() {
        return super.getClassName();
    }
}
