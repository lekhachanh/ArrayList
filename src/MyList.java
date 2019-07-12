import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E e) {
        for (int i = elements.length - 1; i >= index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index - 1] = e;
    }

    public E remove(int index) {
        for (int i = index; i < elements.length; i++) {
            elements[i] = elements [index +1];
        }
        return (E) elements;
    }

    public int size () {
        return elements.length;
    }

    public E clone () {
        E e = (E) Arrays.copyOf(elements, elements.length);
        return e;
    }

    public boolean isContains (E o) {
        for (int i=0; i<elements.length; i++) {
            if (o == elements[i]) {
                break;
            }
        }
        return true;
    }

    public void ensureCapacity (int minCapacity) {
        int newSize = minCapacity ;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get (int index) {
        E e = (E) elements[index - 1];
        return e;
    }

    public void clear () {
        for (int i=0; i<elements.length; i++) {
            elements[i] = null;
        }
    }
}
