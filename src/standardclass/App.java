package standardclass;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        String nama = "Telkom Indonesia";
//        System.out.println(nama);
//        nama.toUpperCase();
//        System.out.println(nama);
//        System.out.println(nama.toUpperCase());
//        System.out.println(nama.length());

//        Number angkaNumber = 1;
//        Integer angkaInteger = Integer.valueOf(1);
//        int angkaIntegerKecil = 1;
//
//        System.out.println(angkaNumber.floatValue());
//        System.out.println(angkaInteger.floatValue());
//        System.out.println(angkaIntegerKecil.floatValue());

//        Double angka = Double.valueOf(1000);
//        System.out.println(angka.getClass());
//        String tulisanAngka = String.valueOf(angka);
//        System.out.println(tulisanAngka.getClass());
//
//        String tulisanBilangan = "123";
//        System.out.println(tulisanBilangan.getClass());
//        Integer bilangan = Integer.valueOf(tulisanBilangan);
//        System.out.println(bilangan.getClass());

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Masukkan tanggal lahir: ");
//        int tanggalLahir = scanner.nextInt();
//
//        int usia = 2022 - tanggalLahir;
//
//        System.out.println("Usia Anda " + usia);

//        Date date = new Date();
//        long milisecond = date.getTime();
//
//        System.out.println(date);
//        System.out.println(milisecond);

//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar);
//        System.out.println(calendar.getTime());
//        System.out.println("Tanggal " + calendar.get(Calendar.DATE));
//        System.out.println("Bulan " + calendar.get(Calendar.MONTH));
//        System.out.println("Tahun " + calendar.get(Calendar.YEAR));
//
//        int birthDate = 1;
//        int birthMonth = 8;
//        int birthYear = 2000;
//
//        Calendar birth = Calendar.getInstance();
//        birth.set(Calendar.DATE, birthDate);
//        birth.set(Calendar.MONTH, birthMonth);
//        birth.set(Calendar.YEAR, birthYear);
//        System.out.println(birth.getTime());

        Random random = new Random();
        int randomInt = random.nextInt(9);
        System.out.println(randomInt);
    }


}
