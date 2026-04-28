public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        int[] arr2 = new int[arr.length];
        int j = 0;
        for(int i=0 ; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                arr2[j++] = arr[i];
            }
        }
        arr2[j++] = arr[arr.length-1];
        for(int i=0; i<j; i++){
            System.out.print(arr2[i] + " ");
        }
        
    }
}
