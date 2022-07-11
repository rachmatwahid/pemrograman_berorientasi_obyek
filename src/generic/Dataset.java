package generic;

public class Dataset<T> {

    private T[] list;

    Dataset(T[] dataset) {
        this.list = dataset;
    }

    public boolean greaterThan(Dataset<?> otherDataset) {
        boolean result = (list.length > otherDataset.list.length) ? true : false;
        return result;
    }
}
