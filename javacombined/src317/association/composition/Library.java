package javacombined.src317.association.composition;

import java.util.List;

public class Library {
    public final List<Book> books;
    public Library(List<Book> books) {
        this.books = books;
    }
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
