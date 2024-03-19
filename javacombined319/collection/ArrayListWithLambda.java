package javacombined319.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithLambda {
    void usingArrayList() {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(90);
        list.add(80);
        //used lambda in foreach
        list.forEach((element) -> System.out.println(element));
    }

    public static void main(String[] args) {
        ArrayListWithLambda arrayListWithLambda = new ArrayListWithLambda();
        arrayListWithLambda.usingArrayList();
    }
}
