package classobject;

import java.time.YearMonth;

class Book {
    String title;
    int yearPublished;
    final String language = "English";

    boolean isVintage(int currentYear) {
        int age = currentYear - yearPublished;
        return age >= 50;
    }

    boolean isVintage() {
        int currentYear = YearMonth.now().getYear();
        int age = currentYear - yearPublished;
        return age >= 50;
    }
}
