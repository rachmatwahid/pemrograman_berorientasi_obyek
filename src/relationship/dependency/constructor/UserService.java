package relationship.dependency.constructor;

public class UserService {
    private Logger logger;
    public UserService(Logger logger) {
        this.logger = logger;
    }
    public void createUser() {
        logger.log();
    }
}
