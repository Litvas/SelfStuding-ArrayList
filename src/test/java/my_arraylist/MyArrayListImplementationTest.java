package my_arraylist;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MyArrayListImplementationTest {

    Integer integer = new Integer("23");
    Integer integer2 = new Integer("24");
    Integer integer3 = new Integer("25");
    MyArrayListImplementation myArrayListImplementation = new MyArrayListImplementation();
    MyArrayListImplementation myArrayListImplementationEmpty = new MyArrayListImplementation();
    ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
    MyArrayListImplementation.MyIteratorForList myIteratorForList = (MyArrayListImplementation.MyIteratorForList) new MyArrayListImplementation().iterator();

    public MyArrayListImplementationTest() {
    }

    public void testAddWithoutParametrs() {
        Assert.assertTrue(myArrayListImplementation.add(integer));
    }

    @Test
    public void testAddWithParametrs() {
        myArrayListImplementation.add(150, integer);
   //     System.out.println(myArrayListImplementation.get(150));
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
    public void testIteratorHasNext() {
        myIteratorForList.setPosition(174);
        for (int i = 0; i < 15; i++) {
            myArrayListImplementation.add(i);
        }
                Assert.assertTrue(myArrayListImplementation.iterator().hasNext());
    }

    @Test
    public void testIteratorNext() {
        for (int i = 0; i < 5; i++) {
            myArrayListImplementation.add(integer);
        }
        Assert.assertEquals(integer, myArrayListImplementation.iterator().next());
        myIteratorForList.setPosition(150);
      //  System.out.println(myArrayListImplementation.iterator().next()+ ") "+ myIteratorForList.getPosition());

    }

    @Test
    public void testContains() {
        for (int i = 0; i < 5; i++) {
            myArrayListImplementation.add(integer);
        }
        Assert.assertTrue(myArrayListImplementation.contains(integer));
       Assert.assertFalse(myArrayListImplementation.contains(integer2));
    }

    @Test
    public void testIndexOf() {
        for (int i = 0; i < 5; i++) {
            myArrayListImplementation.add(integer);
        }
        myArrayListImplementation.add(integer2);
        Assert.assertEquals(0, myArrayListImplementation.indexOf(integer));
        Assert.assertEquals(5, myArrayListImplementation.indexOf(integer2));
        Assert.assertEquals(-1, myArrayListImplementation.indexOf(integer3));
    }

    @Test
    public void testLastIndexOf() {
        for (int i = 0; i < 5; i++) {
            myArrayListImplementation.add(integer);
        }
        myArrayListImplementation.add(integer2);
        Assert.assertEquals(4, myArrayListImplementation.lastIndexOf(integer));
        Assert.assertEquals(-1, myArrayListImplementation.lastIndexOf(integer3));
    }

}
