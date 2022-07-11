package generic;

public class LearnContravariant {
    public static void main(String[] args) {
        Data<Object> name = new Data<>("John");
        Data<? super String> fullName = name;
    }
}
