public class HallowTriangle {
    public static void main(String[] args) {
        int m = 4;
        for(int i=0;i<m;i++){
            for(int j=0;j<2*m-1;j++){
                if(i == m - 1 || j == m - i - 1 || j == m + i - 1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
