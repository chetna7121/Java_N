package javacombined319.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class ChatGroup {
    void usingHashSet(){
        //diamond problem - we cannot use super class object at right side
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Rahul");
        hashSet.add("Ravi");
        hashSet.add("Mayank");
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        for (String string:hashSet)
        {
            System.out.println(string);
        }
    }
    public static void main(String[] args) {
        ChatGroup chatGroup = new ChatGroup();
        chatGroup.usingHashSet();
    }
}
