package generic;

public class LearnGenericMultipleParameterType {
    public static void main(String[] args) {

        DataPair<String, String> account = new DataPair<>("Administrator", "Admin123");
        System.out.println(account.getFirst());
        System.out.println(account.getSecond());

        DataPair<String, Integer> player = new DataPair<>("Kraken", 80);
        System.out.println(player.getFirst());
        System.out.println(player.getSecond());
    }
}
