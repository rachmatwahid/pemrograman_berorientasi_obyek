package abstraction.statickeyword;

import java.awt.*;

class Airplane {

    public static final byte numberOfEngines = 2;
    boolean canFly = true;
    static List passengers;

    static {
        passengers.add("Anna");
        passengers.add("John");
        passengers.add("Marlyn");
    }

    static byte getNumberOfEngines() {
        return numberOfEngines;
    }

//    static boolean fly() {
//        return canFly;
//    }
}
