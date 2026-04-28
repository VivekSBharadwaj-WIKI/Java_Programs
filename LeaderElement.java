public class LeaderElement {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,2,5};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
}
