package nov10;

public class Container<T,R> {

    T item1;
    R item2;


    public Container(T item1, R item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return "Container{" +
                "item1='" + item1 + '\'' +
                ", item2='" + item2 + '\'' +
                '}';
    }
}
