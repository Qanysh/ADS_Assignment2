public interface MyList<E> extends Iterable<E> {
    void add(E item);
    E get(int index);

    E remove(int index);

    int size();
}
