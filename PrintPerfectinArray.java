public class PrintPerfectinArray {
    public static void main(String[] args) {
        int[] n = { 2, 4, 6, 16, 26 ,24 };

        for (int k = 0; k < n.length; k++) {
            int sum = 0;
            for (int i = 1; i < n[k]; i++) {
                if (n[k] % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == n[k]) {
                System.out.println(n[k] + " is a Perfect Number");
            }else{
                System.out.println(n[k] + " is not a Perfect number");
            }
        }
    }
}