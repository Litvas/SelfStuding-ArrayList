package my_arraylist;

import java.util.*;


public class MyArrayListImplementation<T> implements List {

    int position = 0;
    public Object[] objects = new Object[10];


    public MyArrayListImplementation(Object[] objects) {
        this.objects = objects;
    }

    public MyArrayListImplementation() {
    }

    // Done! With test.
    @Override
    public int size() {
        int sizeOfMyArrayList = 0;
        for (int i = 0; i < objects.length - 1; i++) {
            if (objects[i] != null) sizeOfMyArrayList++;
        }
        return sizeOfMyArrayList;
    }

    // Done! With 2 tests for 2 conditions.
    @Override
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

    // Uncomplete
    @Override
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

    // Done! repair test
    @Override
    public Object[] toArray() {
        return objects;
    }

    // Done! With test.
    @Override
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

    // Done! With test
    @Override
    public void add(int index, Object objectForPaste) {
        if (index < objects.length - 1) {
            objects[index] = objectForPaste;
        } else {
            while (index > objects.length - 1){
              changeCapacityOfArray();
            }
            add(index, objectForPaste);
        }
    }

    // Method for change capacity of array. Using by methods are add
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

    // Done!
    @Override
    public Object get(int index) {
        Object object = objects[index];
        return object;
    }

    // Done!
    @Override
    public Object set(int index, Object element) {
        objects[index] = element;
        return objects[index];
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
    public Object[] toArray(Object[] objectForReturn) {
                return objectForReturn;
    }


}
