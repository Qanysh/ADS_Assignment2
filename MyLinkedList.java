import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E> {

    private class MyNode {
        private final E data;
        private MyNode next;
        private MyNode prev;
        public MyNode element;
        public MyNode(E data) {
            this.data = data;
        }
    }
    MyNode element;
    private MyNode head;
    private MyNode tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void add(E item) {
        MyNode newNode = new MyNode(item);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }

        MyNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        MyNode current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++)
                current = current.next;
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--)
                current = current.prev;
        }
        return (E) current.element;
    }
    
    @Override
    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        MyNode current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++)
                current = current.next;
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--)
                current = current.prev;
        }
        if (current.prev != null)
            current.prev.next = current.next;
        else
            head = current.next;
        if (current.next != null)
            current.next.prev = current.prev;
        else
            tail = current.prev;
        size--;
        return (E) current.element;
    }
    
    @Override
    public int size() {
        return size;
    }
    
        private class MyIterator implements Iterator<E> {
        MyNode cursor = head;


        public boolean hasNext() {
            return cursor != null;
        }


        public E next() {
            E data = cursor.data;
            cursor = cursor.next;
            return data;
        }

}
