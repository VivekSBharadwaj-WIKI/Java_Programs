import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] num = {5,9,1,4,8,7,3,2};
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                if(num[i]>=num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
