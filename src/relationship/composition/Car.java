package relationship.composition;

public class Car {
    private Engine engine;
    public Car(String engineType) {this.engine = new Engine(engineType); }
    public void startCar() { engine.start(); }
    public void stopCar() { engine.stop(); }
}
