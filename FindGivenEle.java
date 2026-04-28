import java.util.Scanner;

public class FindGivenEle {
            public static void main(String[] args) {
        int[] num = {5,9,1,4,8,7,3,2};
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the number to find : ");
        int n = scanner.nextInt();
        for(int i=0;i<num.length;i++){
            if(num[i] == n){
                System.out.println("Element found");
            }
        }
    }
}
