package classobject;

public class MagazineApp {
    public static void main(String[] args) {
        Magazine myMagazine = new Magazine("Trubus", 1);
        System.out.println(myMagazine.title);

        Magazine hisMagazine = new Magazine();
        System.out.println(hisMagazine.title);
    }
}
