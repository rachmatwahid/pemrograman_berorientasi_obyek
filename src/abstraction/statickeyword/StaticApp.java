package abstraction.statickeyword;

public class StaticApp {
    public static void main(String[] args) {
         Car.Engine myEngine = new Car.Engine();

        System.out.println("We have " + Airplane.numberOfEngines + " engines working");
        System.out.println("We have " + Airplane.getNumberOfEngines() + " engines working");
    }
}
