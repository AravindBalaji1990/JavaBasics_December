package genericsdemo;

//T - type parameter which can be of any datatype
public class SampleClassDemo<T> {
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    private T value;

}
