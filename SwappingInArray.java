import java.util.Arrays;

public class SwappingInArray {
    public static void main(String[] args) {
        int[] n = {10,20,30,40,50};
        int temp = n[0];
        n[0] = n[n.length-1];
        n[n.length-1]=temp;
        System.out.println(Arrays.toString(n));
    }
}
