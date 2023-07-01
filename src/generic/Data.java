package generic;

public class Data<T> {

    final private T data;

    Data(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public boolean isEqualWith(Data<T> otherData) {
        return data.equals(otherData);
    }
}