package javacombined319.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PersonArrayList {
    void usingArrayList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Tarun1", 21));
        personList.add(new Person("Tarun2", 22));
        personList.add(new Person("Tarun3", 23));
        personList.add(new Person("Tarun4", 24));
        personList.add(new Person("Tarun5", 25));

        //using filter to filter list
        Stream<Person> personStream = personList.stream().filter(p -> p.age > 23);
        personStream.forEach(p -> System.out.println(p.name + "\t" + p.age));

        Stream<Integer>integerStream = Stream.of(1,2,3,4,5);
        integerStream.forEach(p-> System.out.println(p));
    }

    public static void main(String[] args) {
        PersonArrayList personArrayList = new PersonArrayList();
        personArrayList.usingArrayList();
    }
}
