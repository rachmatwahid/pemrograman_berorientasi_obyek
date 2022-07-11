package generic;

public class DataPair<T, V> {

    private T first;
    private V second;

    DataPair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
