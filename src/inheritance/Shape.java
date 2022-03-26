package inheritance;

class Shape {

    byte dimensions = 2;
    String fillColor;

    Shape(String fillColor) {
        this.fillColor = fillColor;
    }

    String getClassName() {
        return "Shape Class";
    }

    class Line {
        double coordinateX;
        double coordinateY;

        String getOuterClassName() {
            return getClassName();
        }
    }
}
