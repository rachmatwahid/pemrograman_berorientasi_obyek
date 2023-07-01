package relationship.dependency.transitive;

public class UserService {
    private DatabaseConnector connector;
    public UserService(DatabaseConnector connector) {
        this.connector = connector;
    }
    public void createUser() {
        connector.connect();
    }
}
