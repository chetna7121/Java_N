package javacombined319.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class UsingTreeSet {
    void usingTreeSet() {
        TreeSet<Integer> treeSet = new TreeSet();
        treeSet.add(100);
        treeSet.add(90);
        treeSet.add(190);
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        UsingTreeSet usingTreeSet = new UsingTreeSet();
        usingTreeSet.usingTreeSet();
    }
}
