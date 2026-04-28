import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int[] rev = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            rev[i] = num[num.length - 1 - i];
        }

        System.out.println(Arrays.toString(rev));
    }
}