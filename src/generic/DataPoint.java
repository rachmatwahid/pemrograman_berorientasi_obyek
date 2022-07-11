package generic;

public class DataPoint<T extends Number> {

    T[] numbers;

    DataPoint(T[] numbers) {
        this.numbers = numbers;
    }

    public double average() {
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }
        double avg = sum/ numbers.length;
        return avg;
    }
}
