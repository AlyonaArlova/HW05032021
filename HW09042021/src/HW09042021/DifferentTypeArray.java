package HW09042021;

public class DifferentTypeArray<T> {
    private T[] array;

    public T[] getArray() {
        return array;
    }

    public DifferentTypeArray(T[] array) {
        this.array=array;
    }

    public T getArrayIndex(int i) {
        return array[i];
    }

    public int getLength() {
        return array.length;
    }
}

