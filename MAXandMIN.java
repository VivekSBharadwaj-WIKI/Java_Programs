public class MAXandMIN {
    public static void main(String[] args) {
        int[] arr = {5,9,1,4,8,7,3,2};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max <= arr[i]){
                max = arr[i];
            }
            if(min >= arr[i]){
                min = arr[i];
            }
        }
        System.out.println(max + "  " + min);
    }
}
