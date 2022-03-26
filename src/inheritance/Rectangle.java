package inheritance;

class Rectangle extends Quadrilateral {

    double firstSideLength, secondSideLength;

    Rectangle(double firstSideLength, double secondSideLength) {
        super("White");
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
    }

    final String getSimpleName() {
        return "Rectangle Class";
    }
}
