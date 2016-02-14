import MyArrayList.MyArrayList;

/**
 * Created by as on 13.02.16.
 */
public class Main {

    public static void main(String[] args) {
        String stringForPaste = "String for paste";
        MyArrayList<String> myArrayList = new MyArrayList<String>();
        for (int i = 0; i < 5; i++) {
            myArrayList.add(stringForPaste);
            System.out.println(myArrayList.get(i).toString());
            System.out.println(i + ") " + myArrayList.size());
        }
        System.out.println(myArrayList.set(1, "0"));
        //    System.out.println(myArrayList.contains("String for paste"));
        System.out.println("All right!");
    }
}
