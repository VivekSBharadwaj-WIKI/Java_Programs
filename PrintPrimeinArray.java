public class PrintPrimeinArray {
    public static void main(String[] args) {
        int[] num = { 1, 3, 4, 5, 6, 7, 8, 9 };

        for (int i = 0; i < num.length; i++) {
            int count = 0;

            if (num[i] <= 1) {
                System.out.println(num[i] + " Neither");
                continue;
            }

            for (int j = 2; j <= num[i] / 2; j++) {
                if (num[i] % j == 0) {
                    count++;
                }
            }

            if (count >= 1) {
                System.out.println(num[i] + " Not a Prime");
            } else {
                System.out.println(num[i] + " Prime Number");
            }
        }
    }
}