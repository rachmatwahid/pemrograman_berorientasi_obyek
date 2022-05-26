package exception;

import java.time.LocalDate;

public class App {

    static int ageToYearOfBirth(int age) throws InvalidAgeException {
        if (age <= 0 || age >= 100) {
            throw new InvalidAgeException(age);
        }
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return currentYear - age;
    }

    public static void main(String[] args) {
        int johnAge = 0;
        try {
            System.out.println("John born in " + ageToYearOfBirth(johnAge));
        } catch (InvalidAgeException e) {
            System.out.println(e.getExceptionMessage());
        }
    }
}
