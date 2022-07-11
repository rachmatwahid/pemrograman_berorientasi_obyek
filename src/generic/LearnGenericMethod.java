package generic;

public class LearnGenericMethod {

    public static <T> int count(T[] array) {
        return array.length;
    }

    public static void main(String[] args) {
        String[] arrayOfString = {"Lorem", "Ipsum", "Dolor"};
        System.out.println(count(arrayOfString));

        Integer[] arrayOfInt = {1, 2, 3};
        System.out.println(count(arrayOfInt));
    }
}
