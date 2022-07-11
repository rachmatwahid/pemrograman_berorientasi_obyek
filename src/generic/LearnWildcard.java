package generic;

public class LearnWildcard {
    public static void main(String[] args) {
        Data<?> name = new Data<>("John");
        Data<?> fullName = name;
    }
}
