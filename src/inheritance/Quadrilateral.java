package inheritance;

class Quadrilateral extends Shape {

    byte side = 4;

    String getParentClassName() {
        return name;
    }

    String getParentSimpleName() {
        return super.getClassName();
    }
}
