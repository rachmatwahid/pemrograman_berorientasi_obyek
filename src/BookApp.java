public class BookApp {
    public static void main(String[] args) {
        Book myBook = new Book();
        Book herBook = new Book();

        Book hisBook = new Book();
        hisBook.title = "The Hunger Games";
        hisBook.yearPublished = 2008;

        System.out.println(hisBook.title);
        System.out.println(hisBook.language);
        System.out.println(hisBook.isVintage(2020));
    }
}
