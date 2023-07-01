package relationship.dependency.method;

public class UserService {
    private Logger logger;
    public UserService() {
        this.logger = new Logger();
    }
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
