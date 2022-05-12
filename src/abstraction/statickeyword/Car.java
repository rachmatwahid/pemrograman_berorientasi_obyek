package abstraction.statickeyword;

class Car {

    byte numberOfTires = 4;
    static String carModel = "SUV";

    static class Engine {

//        byte getNumberOfTires() {
//            return numberOfTires;
//        }

        String getCarModel() {
            return carModel;
        }
    }
}
