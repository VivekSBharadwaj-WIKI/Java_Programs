public class SumofArray {
    public static void main(String[] args) {
        int[] num = {1,4,8,2,3,9};
        int sum = 0;
        for(int i=0;i<num.length;i++){
            sum = sum + num[i];
        }
        System.out.println(sum);
    }
}
