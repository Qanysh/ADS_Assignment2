import java.util.Arrays;
import java.util.List;

public abstract class MyArrayList<T> implements List<T> {

    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = elements.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity)
                newCapacity = minCapacity;
            elements = Arrays.copyOf(elements, newCapacity);
        }
            
     public boolean add(T element) {
        ensureCapacity(size + 1);
        elements[size++] = element;
        return true;
    }

    }
}
