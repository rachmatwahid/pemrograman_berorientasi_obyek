package enumeration;

public class EnumerationApp {
    public static void main(String[] args) {

        System.out.println(Status.REGISTERED);

        Status studentStatus = Status.ACTIVE;
        System.out.println(studentStatus);

        Student studentA = new Student(Status.REGISTERED);
        System.out.println(studentA.paymentInfo());
        System.out.println(studentA.getStatus().statusInfo());

        System.out.println(Status.REGISTERED.ordinal());
        System.out.println(studentA.getStatus().compareTo(Status.ACTIVE));
        System.out.println(studentA.getStatus().toString());
        System.out.println(Status.valueOf("LEAVE"));

        Status[] arrayOfStatus = Status.values();
        System.out.println(arrayOfStatus[0]);

    }
}
