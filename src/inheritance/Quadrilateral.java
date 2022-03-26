package inheritance;

class Quadrilateral extends Shape {

    Quadrilateral(String fillColor) {
        super(fillColor);
    }

    byte getDimension() {
        return dimensions;
    }

    String getParentClassName() { return super.getClassName(); }
}
