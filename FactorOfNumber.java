public class FactorOfNumber {
    public static void main(String[] args) {
        int n = 120;
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+" is a factor of "+n);
            }else{
                System.out.println(i+" is not a factor of "+n);
            }
        }
    }
}
