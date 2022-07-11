package generic;

public class LearnGeneric {
    public static void main(String[] args) {

        Data<String> name = new Data<>("John Doe");
        System.out.println(name.getData());

        Data<Integer> age = new Data<>(17);
        System.out.println(age.getData());
    }
}
