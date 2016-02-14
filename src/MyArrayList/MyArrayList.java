package MyArrayList;

import java.util.*;


public class MyArrayList<T> implements List {

    int position = 0;
    private static Object[] objects = new Object[10];


    public MyArrayList(Object[] objects) {
        this.objects = objects;
    }

    public MyArrayList() {
    }

    @Override
    // Done!
    public int size() {
        int sizeOfMyArrayList = 0;
        for (int i = 0; i < objects.length - 1; i++) {
            if (objects[i] != null) sizeOfMyArrayList++;
        }
        return sizeOfMyArrayList;
    }

    @Override
    // Done!
    public boolean isEmpty() {
        boolean isListEmpty = true;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null) {
                isListEmpty = false;
                break;
            } else isListEmpty = true;
        }
        return isListEmpty;
    }

    @Override
    // Uncomplete
    public boolean contains(Object object) {
        boolean isEquals = false;
        for (int i = 0; i < objects.length - 1; i++) {
            if (objects[i].equals(object)) {
                isEquals = true;
            }
        }
        return isEquals;
    }

    @Override
    public Iterator iterator() {

        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    // Done!
    public boolean add(Object objectForPaste) {
        boolean successPaste = false;
        while (successPaste != true) {
            if (objects[position] == null & position < objects.length - 1) {
                objects[position] = objectForPaste;
                position++;
                successPaste = true;
            } else if (position == objects.length - 1 & successPaste == false) {
                position = objects.length - 1;
                changeCapacityOfArray();
                successPaste = false;
            }
        }
        return successPaste;
    }

    // Method for change capacity of array. Using by method is add
    private Object[] changeCapacityOfArray() {
        Object[] arrayForCopy = new Object[objects.length];
        for (int i = 0; i < objects.length - 1; i++) {
            arrayForCopy[i] = objects[i];
        }
        double capacityPersentage = objects.length * 1.5;
        objects = new Object[(int) capacityPersentage];
        for (int i = 0; i < arrayForCopy.length - 1; i++) {
            objects[i] = arrayForCopy[i];
        }
        return objects;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    // Done!
    public void clear() {
        for (int i = 0; i < objects.length - 1; i++) {
            if (objects[i] != null) {
                objects[i] = null;
            }
        }

    }

    @Override
    // Done!
    public Object get(int index) {
        Object object = objects[index];
        return object;
    }

    @Override
    // Done!
    public Object set(int index, Object element) {
        objects[index] = element;
        return objects[index];
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        objects[index] = null;
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {

        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public T[] toArray(Object[] a) {
        //todo change return type
        return null;
    }
}
