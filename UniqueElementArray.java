public class UniqueElementArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1,4,3,0,3,0};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i] == arr[j] && i!=j){
                    break;
                }
                if(j == arr.length-1){
                    System.out.println("Unique element in array is " + arr[i]);
                }
            }
        }
    }
}
