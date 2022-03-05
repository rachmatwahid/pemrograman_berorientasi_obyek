class Book {
    String title;
    int yearPublished;
    final String language = "English";

    boolean isVintage(int currentYear) {
        int age = currentYear - yearPublished;
        return age >= 50;
    }
}
