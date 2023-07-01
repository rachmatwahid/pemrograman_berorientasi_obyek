package relationship.association.manytoone;

public class App {
    public static void main(String[] args) {
        Author author = new Author("JK Rowling");

        Book firstBook = new Book("Harry Potter and the Philosopher's Stone");
        Book secondBook = new Book("Harry Potter and the Chamber of Secrets");

        author.addBook(firstBook);
        author.addBook(secondBook);
    }
}
