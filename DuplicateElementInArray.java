public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4,3};

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length;j++){
                if(arr[i] == arr[j] && i!=j){
                    System.out.println("Duplicate element in array is " + arr[i]);
                }
            }
        }
    }
}
