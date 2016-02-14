package test;

import MyArrayList.MyArrayList;
import org.junit.Test;

public class TestMyArrayList {

    static MyArrayList myArrayListNotNull = new MyArrayList();
    static Integer[] arrayNotNull = new Integer[10];
    String string = "123";

    @Test
    public void testIsEmptyForNotNull() {

    }

    @Test
    public void testContains() {
        myArrayListNotNull.add(string);
        assert (myArrayListNotNull.contains("123"));
    }
}
