package relationship.association.onetoone;

public class App {
    public static void main(String[] args) {
        Address address = new Address("First Street", "Big City");
        Person person = new Person("John", address);

        System.out.println(person.getName());
        System.out.println(person.getAddress().getStreet());
    }
}
