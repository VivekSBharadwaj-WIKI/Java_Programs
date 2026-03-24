public class ReverseNumber {
    public static void main(String[] args) {
        int n = 234;
        int m = 0;
        while(n!=0){
            m = (m * 10) + (n % 10);
            n = n / 10;
        }
        System.out.println(m);
    }
}
