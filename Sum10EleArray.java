public class Sum10EleArray{
    public static void main(String[] args) {
        int[] n = {6,3,9,1,2,8,4,5};
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i] + n[j] == 10){
                    System.out.println(n[i] +" "+ n[j]);
                }
            }
        }
    }
}