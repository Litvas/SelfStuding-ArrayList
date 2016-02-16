package my_arraylist;

import junit.framework.Assert;
import org.junit.Test;

public class MyArrayListImplementationTest {

    Integer integer = new Integer("23");
    MyArrayListImplementation myArrayListImplementation = new MyArrayListImplementation();
    MyArrayListImplementation myArrayListImplementationEmpty = new MyArrayListImplementation();

    @Test
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

    @Test
    public void testGet() {
        myArrayListImplementation.add(integer, integer);
        Assert.assertEquals(integer, myArrayListImplementation.get(integer));
    }

    //Repair test
    @Test
    public void testToArray() {

    }
}
