public class Fibo {
    public static void main(String[] args) {
        long x = 0;
        long y = 1;
        long n = 100;
        System.out.println(x);
        System.out.println(y);
        for(int i=0;i<=n;i++){
            long z = x + y;
            System.out.println(z);
            x = y;
            y = z;
        }
    }
}
