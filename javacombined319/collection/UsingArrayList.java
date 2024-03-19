package javacombined319.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingArrayList {
    void usingArrayList(){
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add( 100);
        arrayList.add("Pinky");
        arrayList.add(100.98);
        Iterator iterator = arrayList.listIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        UsingArrayList usingArrayList = new UsingArrayList();
        usingArrayList.usingArrayList();
    }
}
