package relationship.dependency.constructor;

public class App {
    public static void main(String[] args) {
        Logger logger = new Logger();
        UserService service = new UserService(logger);
        service.createUser();
    }
}
