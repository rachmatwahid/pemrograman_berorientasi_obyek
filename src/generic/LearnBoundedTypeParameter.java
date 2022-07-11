package generic;

public class LearnBoundedTypeParameter {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5};
        DataPoint<Integer> integerDataPoint = new DataPoint<>(integers);

        Number[] numbers = {1,2,3,4,5};
        DataPoint<Number> numberDataPoint = new DataPoint<>(numbers);

        String[] strings = {"1", "2", "3", "4", "5"};
        //DataPoint<String> stringDataPoint = new DataPoint<>(strings);
    }
}
