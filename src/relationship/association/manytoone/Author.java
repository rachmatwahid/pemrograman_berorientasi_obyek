package relationship.association.manytoone;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> books;

    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
