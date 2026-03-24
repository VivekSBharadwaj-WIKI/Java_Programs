public class HallowDiamond {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<2*m-1;j++){
                if(i == m - 1 || j == m - i - 1 || j == m + i - 1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= (2 * (n - i) + 1); j++) {
                if (i == 1 || j == 1 || j == (2 * (n - i) + 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
