package javacombined319.streams;

import javacombined319.collection.UsingArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class UsingStreams {
    void usingStreams() {
        List<String> stringList = Arrays.asList("a", "b", "", "c", "", "d");
        List<String> filteredList = stringList.stream().filter(str -> !str.isEmpty())
                .collect(Collectors.toList());
        filteredList.forEach(
                p -> System.out.println(p)
        );
    }
    void usingStreams1() {
//        Random random = new Random();
//        random.ints().limit(10).forEach(
//                p -> System.out.println(p)
//        );
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        List<Integer> squareList = integerList.stream().map(v -> v*v).collect(Collectors.toList());
        squareList.forEach(
                item-> System.out.println(item)
        );
    }
    public static void main(String[] args) {
        UsingStreams usingStreams = new UsingStreams();
        //  usingStreams.usingStreams();
        usingStreams.usingStreams1();
    }
}
