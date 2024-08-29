public class SwitchCase {
    public static void main(String[] args) throws Exception {
        String banda = "Iron Maiden";

        switch (banda) {
            case "Iron Maiden":
                System.out.println("Melhor banda do mundo!");
                break;
            case "Black Sabbath":
                System.out.println("Segunda melhor banda do mundo :D");
                break;
            case "Led Zeppelin":
                System.out.println("Terceira melhor banda do mundo :)");
                break;
            default:
                System.out.println("Como assim você não conhece essas bandas?!");
        }
    }
}