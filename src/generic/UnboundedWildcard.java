package generic;

public class UnboundedWildcard {

    public static void main(String[] args) {
        Integer[] arrayOfInt = {1, 2, 3, 4};
        String[] arrayOfString = {"1", "2", "3"};

        Dataset<Integer> integerDataset = new Dataset<>(arrayOfInt);
        Dataset<String> stringDataset = new Dataset<>(arrayOfString);

        System.out.println(integerDataset.greaterThan(stringDataset));
    }
}
