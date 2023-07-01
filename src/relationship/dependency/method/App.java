package relationship.dependency.method;

public class App {
    public static void main(String[] args) {
        Logger logger = new Logger();
        UserService service = new UserService();
        service.setLogger(logger);
    }
}
