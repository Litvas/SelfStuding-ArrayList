package my_arraylist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class MyArrayListImplementation<T> implements List {

    int position = 0;
    protected Object[] objects = new Object[10];
    //  protected MyIteratorForList myIteratorForList = new MyIteratorForList();

    //  MyIteratorForList myIteratorForList = new MyIteratorForList();

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
            while (index > objects.length - 1) {
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

    // Done! With test.
    @Override
    public boolean addAll(Collection c) {
        boolean success = false;
        Object[] cToArray = (Object[]) c.toArray();
        for (int i = 0; i < cToArray.length - 1; i++) {
            success = add(cToArray[i]);
        }
        return success;
    }

    // Done! Without test
    @Override
    public boolean addAll(int index, Collection c) {
        boolean success = false;
        Object[] cToArray = (Object[]) c.toArray();
        for (int i = index; i < cToArray.length - 1; i++) {
            while (success != true) {
                if (objects[index] == null & index < objects.length - 1) {
                    objects[index] = cToArray[i];
                    index++;
                    success = true;
                } else if (index == objects.length - 1 & success == false) {
                    index = objects.length - 1;
                    changeCapacityOfArray();
                    success = false;
                }
            }
        }
        return success;
    }

    // Done! With tests for 2 conditions
    @Override
    public void clear() {
        for (int i = 0; i < objects.length - 1; i++) {
            if (objects[i] != null) {
                objects[i] = null;
            }
        }

    }

    // Done! With test
    @Override
    public Object get(int index) {
        Object object = objects[index];
        return object;
    }

    // Done! With 2 tests for different conditions about capacity;
    @Override
    public Object set(int index, Object element) {
        if (index > objects.length - 1) {
            while (index > objects.length - 1) {
                changeCapacityOfArray();
            }
        }
        objects[index] = element;
        return objects[index];
    }

    // Done! With test!
    @Override
    public Object remove(int index) {
        objects[index] = null;
        return null;
    }

    // Done! With test for 2 condition!
    // This method needs in overriding method "equals"
    @Override
    public boolean remove(Object object) {
        boolean remove = false;
        for (int i = 0; i < objects.length - 1; i++) {
            if (objects[i] == object) {
                objects[i] = null;
                remove = true;
            }
        }
        return remove;
    }

    // Done! with test.
    @Override
    public int indexOf(Object object) {
        int index = -1;
        for (int i = 0; i < objects.length - 1; i++) {
            if (objects[i] == object) {
                index = i;
                break;
            }
        }
        return index;
    }

    // Done! with test.
    @Override
    public int lastIndexOf(Object object) {
        int index = -1;
        for (int i = 0; i < objects.length - 1; i++) {
            if (objects[i] == object) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    // Done! With test.
    @Override
    public List subList(int fromIndex, int toIndex) {
        MyArrayListImplementation sublist = new MyArrayListImplementation();
        for (int i = fromIndex; i <= toIndex; i++) {
            sublist.add(objects[i]);
        }
        return sublist;
    }

    // I don`t know of function of this method
    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    // Done! With test.
    @Override
    public boolean removeAll(Collection collection) {
        Object[] objectsCollection = collection.toArray();
        boolean deleted = false;
        for (int i = 0; i < objectsCollection.length - 1; i++) {
            for (int j = 0; j < objects.length - 1; j++) {
                if (objectsCollection[i] == objects[j]) {
                    objects[j] = null;
                    deleted = true;
                } else deleted =false;
            }
        }
        return deleted;
    }

    @Override
    public boolean containsAll(Collection collection) {
        Object[] objectsCollection = collection.toArray();
        boolean contains = false;
        for (int i = 0; i < objectsCollection.length - 1; i++) {
            for (int j = 0; j < objects.length - 1; j++) {
                if (objectsCollection[i] == objects[j]) {
                    contains = true;
                }else contains = false;
            }
        }
        return contains;
    }

    @Override
    public Object[] toArray(Object[] objects) {
        return objects;
    }

    // Done! With test
    @Override
    public MyIteratorForList iterator() {
        MyIteratorForList myIteratorForList = new MyIteratorForList();
        return myIteratorForList;
    }

    // Done! With test for 2 conditions!
    @Override
    public boolean contains(Object object) {
        boolean isEquals = false;
        for (int i = 0; i < objects.length - 1; i++) {
            if (objects[i] == object) {
                isEquals = true;
                break;
            }
        }
        return isEquals;
    }

    protected class MyIteratorForList implements Iterator {

        private int position;

        public void setPosition(int position) {
            this.position = position;
        }

        public int getPosition() {
            return position;
        }

        MyArrayListImplementation myArrayListImplementation = new MyArrayListImplementation();

        public MyIteratorForList() {
        }

        // Done! This method work is incorrect! Fix this
        @Override
        public boolean hasNext() {
            boolean itHasNext;
            if (position + 1 != objects.length - 1) {
                if (objects[position + 1] != null) {
                    itHasNext = true;
                } else itHasNext = false;
            } else itHasNext = false;
            setPosition(position);
            return itHasNext;
        }

        // Done! This method work is incorrect! Fix this
        @Override
        public Object next() {
            Object objectForReturn;
            if (hasNext() == true) {
                objectForReturn = objects[position + 1];
            } else objectForReturn = "This haven`t next element";
            if (position == objects.length - 1) objectForReturn = "It`s last element";
            return objectForReturn;
        }

        // Done! Without test!
        @Override
        public void remove() {
            myArrayListImplementation.remove(position);
        }
    }
}
