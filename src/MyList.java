import com.sun.corba.se.pept.transport.InboundConnectionCache;

import java.util.Arrays;
import java.util.Calendar;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;
    public MyList(){

    }
    public MyList(int capacity){
        elements = (E[]) new Object[capacity];
    }

    public void ensureCapa(int index){
        int newSize = DEFAULT_CAPACITY * (index % DEFAULT_CAPACITY + 1);
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add (int index, E element) {
        if (index >= elements.length) {
            ensureCapa(index);
        }

//        if (elements[DEFAULT_CAPACITY-1].equals(null)) {
//            for (int i = elements.length - 1; i > index; i--) {
//                elements[i] = elements[i-1];
//            }
//        } else {
//            ensureCapa(2);
            for (int i = elements.length - 1; i > index; i--) {
                elements[i] = elements[i-1];
            }
//        }

        elements[index] = element;
        size ++;
    }


    public void checkIndex(int index){
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        }
    }
    public E remove (int index) {
        checkIndex(index);
        Object temp = elements[index];
        for (int i = index; i < elements.length-1; i++) {
            elements[i] = elements[i+1];
        }
        elements[elements.length-1] = null;
        size --;
        return (E) temp;
    }
    public int size(){
        return size;
    }
    public E clone(){
        E[] cloneVersion = (E[]) new Object[elements.length];
        for (int i = 0; i> elements.length; i++) {
            cloneVersion[i] = elements[i];
        }
        return (E) cloneVersion;
    }

    public boolean contains (E o) {
        boolean found = false;
        for (int i = 0; i < elements.length && !found; i++) {
            if (elements[i].equals(o)){
                found = true;
            }
        }
        return found;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i< elements.length; i++) {
            if (elements[i].equals(o)) {
                index = i;
            }
        }
        return index;
    }
    public boolean add(E e) {
        boolean canAdd = false;
        if(contains(e)) {
            canAdd = false;
        } else {
            if (size < elements.length && elements[elements.length-1].equals(null)) {
                for (int i = 0; i < elements.length; i++) {
                    if (elements[i].equals(null)) {
                        elements[i] = e;
                        size++;
                    }
                    canAdd = true;
                }
            } else {
                canAdd = false;
            }
        }
        return canAdd;
    }

    public E get(int i) {
        checkIndex(i);
        return elements[i];
    }

    public void clear(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void printArray(){
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
    }


}
