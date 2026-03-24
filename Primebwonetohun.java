public class Primebwonetohun {
    public static void main(String[] args) {
        for (int j = 1; j <= 100; j++) {
            int count = 0;
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    count++;
                    break;
                }
            }
            if (count >= 1) {
                System.out.println(j + " Not a Prime");
            } else {
                System.out.println(j + " Prime Number");
            }
        }
    }
}
