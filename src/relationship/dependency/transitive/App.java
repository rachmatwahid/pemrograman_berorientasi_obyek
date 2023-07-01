package relationship.dependency.transitive;

public class App {
    public static void main(String[] args) {
        Logger logger = new Logger();
        DatabaseConnector connector = new DatabaseConnector(logger);
        UserService service = new UserService(connector);
        service.createUser();
    }
}
