package my_arraylist;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayListImplementationTest {

    Integer integer = new Integer("23");
    Integer integer2 = new Integer("24");
    MyArrayListImplementation myArrayListImplementation = new MyArrayListImplementation();
    MyArrayListImplementation myArrayListImplementationEmpty = new MyArrayListImplementation();
    ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
    // MyArrayListImplementation.MyIteratorForList myIteratorForList = new MyArrayListImplementation.MyIteratorForList();
    Iterator iterator = myArrayListImplementation.iterator();


    public MyArrayListImplementationTest() {
    }

    public void testAddWithoutParametrs() {
        Assert.assertTrue(myArrayListImplementation.add(integer));
    }

    @Test
    public void testAddWithParametrs() {
        myArrayListImplementation.add(150, integer);
        System.out.println(myArrayListImplementation.get(150));
    }

    @Test
    public void testIsEmptyForNotEmpty() {
        myArrayListImplementation.add(integer);
        Assert.assertFalse(myArrayListImplementation.isEmpty());
    }

    @Test
    public void testIsEmptyForEmpty() {
        Assert.assertTrue(myArrayListImplementationEmpty.isEmpty());
    }

    @Test
    public void testSize() {
        for (int i = 0; i < 6; i++) {
            myArrayListImplementation.add(integer);
        }
        Assert.assertEquals(6, myArrayListImplementation.size());
    }

    // Testing method "set"
    @Test
    public void testSet() {
        Assert.assertEquals(integer, myArrayListImplementation.set(5, integer));
    }

    // Testing method "set". Test for enought capacity
    @Test
    public void testSetForEnoughtCapacity() {
        Assert.assertEquals(integer, myArrayListImplementation.set(155, integer));
    }

    @Test
    public void testGet() {
        myArrayListImplementation.add(integer, integer);
        Assert.assertEquals(integer, myArrayListImplementation.get(integer));
    }

    //Repair test
    @Test
    public void testToArray() {

    }

    @Test
    public void testAddAll() {
        // prepare collection for paste into our list
        for (int i = 0; i < 5; i++) {
            arrayList.add(true);
        }
        myArrayListImplementation.addAll(arrayList);
        Assert.assertEquals(4, myArrayListImplementation.size());
    }

    @Test
    public void testClearForTrue() {
        for (int i = 0; i < 10; i++) {
            myArrayListImplementation.add(integer);
        }
        myArrayListImplementation.clear();
        Assert.assertTrue(myArrayListImplementation.isEmpty());
    }

    @Test
    public void testClearForFalse() {
        for (int i = 0; i < 10; i++) {
            myArrayListImplementation.add(integer);
        }
        myArrayListImplementation.clear();
        myArrayListImplementation.add(integer);
        Assert.assertFalse(myArrayListImplementation.isEmpty());
    }

    @Test
    public void testRemove() {
        myArrayListImplementation.add(2, integer);
        // 1st condition for true
        Assert.assertTrue(myArrayListImplementation.remove(integer));
        // 2nd condition for false
        Assert.assertFalse(myArrayListImplementation.remove(integer2));
    }

    @Test
    public void testRemoveByIndex() {
        for (int i = 0; i < 5; i++) {
            myArrayListImplementation.add(integer);
        }
        Assert.assertEquals(integer, myArrayListImplementation.get(2));
        Assert.assertNull(myArrayListImplementation.remove(2));
    }

    @Test
    public void testIterator() {

    }

}
