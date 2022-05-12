package inheritance;

class Quadrilateral extends Shape {

    byte sides = 4;

    Quadrilateral(String fillColor) {
        super(fillColor);
    }

    byte getDimension() {
        return dimensions;
    }

    String getParentClassName() { return super.getClassName(); }
}
