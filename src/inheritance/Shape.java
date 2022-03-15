package inheritance;

class Shape {

    String name = "Shape Class";

    String getClassName() {
        return name;
    }

    class Line {
        double coordinateX;
        double coordinateY;

        Line(String lineColor) {
            name = lineColor;
        }

        String getInnerSimpleName() {
            return getClassName();
        }
    }
}
