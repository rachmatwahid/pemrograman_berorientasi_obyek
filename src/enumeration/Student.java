package enumeration;

public class Student {
    private Status status;

    Student(Status status) {
        this.status = status;
    }

    public String paymentInfo() {
        switch (status) {
            case REGISTERED: case ACTIVE:
                return "Payment required";
            case LEAVE: case DROPOUT:
                return "Payment unnecessary";
            default:
                return "No information available";
        }
    }

    public Status getStatus() {
        return status;
    }
}
