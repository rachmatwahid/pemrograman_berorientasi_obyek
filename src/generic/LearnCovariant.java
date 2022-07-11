package generic;

public class LearnCovariant {
    public static void main(String[] args) {
        Data<String> name = new Data<>("John");
        Data<? extends Object> fullName = name;
    }
}
