public class CountNumberOfDigits {
    public static void main(String[] args) {
        int n = 4567;
        int count = 0;
        while(n!=0){
                count++;
                System.out.println(count);
                n=n/10;
        }
    }
}
