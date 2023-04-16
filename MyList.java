public interface MyList<E> extends Iterable<E> {
    int size();
    boolean contains(Object o);
    void add (E item, int index);
    void add(E item);
    boolean remove(E item);
    E remove(int index);
    void clear();
    E get(int index);
    int indexOf(Object o);
    int lastIndexOf(Object o);
    void sort();
}
