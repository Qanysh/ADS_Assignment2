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
}
