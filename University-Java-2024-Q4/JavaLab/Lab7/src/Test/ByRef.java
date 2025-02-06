package Test;

// Generic class
public class ByRef<T> {
    private T value;

    public ByRef(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
