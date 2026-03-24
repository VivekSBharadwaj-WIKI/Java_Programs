public class CountEvenNumberinArray {
    public static void main(String[] args) {
        int[] n = {1,6,9,4,2,8,7,3,5};
        int count = 0;
        for(int i=0;i<=n.length-1;i++){
            if(n[i]%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
