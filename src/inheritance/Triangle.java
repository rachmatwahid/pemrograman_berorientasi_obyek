package inheritance;

public class Triangle extends Quadrilateral{

    private short firstAngle;
    protected short secondAngle;
    public short thirdAngle;

    Triangle(String color) {
        super(color);
    }
}
