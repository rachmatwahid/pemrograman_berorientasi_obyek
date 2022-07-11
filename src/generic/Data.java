package generic;

public class Data<T> {

    private T data;

    Data(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public boolean isEqualWith(Data<T> otherData) {
        if (data.equals(otherData)) {
            return true;
        } else {
            return false;
        }
    }
}
