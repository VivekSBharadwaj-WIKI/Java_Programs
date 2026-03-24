public class Palindrome {
    public static void main(String[] args) {
        int a = 121;
        int n = a;
        int m = 0;
        while(n!=0){
            m = (m * 10) + (n % 10);
            n = n / 10;
        }
        if(a == m){
            System.out.println("It is an Palindrome number.");
        }else{
            System.out.println("It is not an palindrome number.");
        }
    }
}
