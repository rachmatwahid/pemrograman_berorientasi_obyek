package standardclass;

import java.util.Calendar;

public class LearnSetCalendar {
    public static void main(String[] args) {

        int birthDate = 1;
        int birthMonth = 8;
        int birthYear = 2000;

        Calendar birth = Calendar.getInstance();
        birth.set(Calendar.DATE, birthDate);
        birth.set(Calendar.MONTH, birthMonth);
        birth.set(Calendar.YEAR, birthYear);
        System.out.println(birth.getTime());
    }
}
