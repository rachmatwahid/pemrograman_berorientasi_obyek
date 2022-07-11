package relationship;



public class LearnGeneralization {
    public static void main(String[] args) {
        
    }
}

class User {
    protected String id;
}

class Costumer extends User {
    private int balance;
}

class Employee extends User {
    private byte grade;
}
