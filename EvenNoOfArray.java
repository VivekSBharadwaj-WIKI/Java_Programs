import java.util.Arrays;

public class EvenNoOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[arr.length];
        int j = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                b[j++] = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                b[j++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(b));
    }
}