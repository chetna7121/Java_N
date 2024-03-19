package java2nd.three1324;

import java.sql.PreparedStatement;
import java.util.*;

public class UsingString {
    void checkString() {
//        //immutable - object can't be change and it does not die
//        //new object
//        String value = "Rohit Sharma";
//        //new object
//        value = "Rahul Sharma";
//        //no new object because value is same , so in String pool it
//        //will look for same value
//        String name="Rahul Sharma";
//        //we are intentionally creating a new object ,
//        //so value doesn't matter
//        String name1 = new String("Rahul Sharma");

    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.set(1, "D");
        System.out.println(list.get(1));
    }
}
