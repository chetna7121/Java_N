package javacombined.src317.association.composition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Gandhi Philosoply","Libetnez"));
        bookList.add(new Book("Nature of Nature","Great Students"));
        Library library = new Library(bookList);
        library=null;
        System.out.println(library);
    }
}
