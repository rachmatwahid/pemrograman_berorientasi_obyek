package generic;

public class LearnGenericMethodMultipleParameterType {

    public static <T,G> void listPair(T[] firstLists, G[] secondLists) {
        for (int i = 0; i < firstLists.length; i++) {
            System.out.println(firstLists[i] + " " + secondLists[i]);
        }
    }

    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Jeffrey"};
        Integer[] ages = {17, 22, 21};
        listPair(names, ages);
    }
}
