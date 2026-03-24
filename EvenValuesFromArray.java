public class EvenValuesFromArray {
    public static void main(String[] args) {
        int[] n = {1,6,9,4,2,8,7,3,5};
        for(int i=0;i<=n.length-1;i++){
            if(n[i]%2==0){
                System.out.println(n[i]);
            }
        }
    }
}
