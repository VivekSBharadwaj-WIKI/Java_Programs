public class AtTheRatePattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            char symbol = (i % 2 == 0) ? '@' : '*';
            for (int j = 0; j < 5; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
