package relationship.association.onetomany;

public class App {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("John");
        Employee secondEmployee = new Employee("Jane");

        Department department = new Department("IT");
        department.addEmployee(firstEmployee);
        department.addEmployee(secondEmployee);
    }
}
