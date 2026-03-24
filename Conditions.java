public class Conditions {
    public static void main(String[] args) {
        int x = 76;
        if(x>=90 && x<=100){
            System.out.println("A grade");
        }else if(x>=70 && x<=89){
            System.out.println("B grade");
        }else if(x>=50 && x<=69){
            System.out.println("C grade");
        }else if(x>=35 && x<=49){
            System.out.println("D grade");
        }else{
            System.out.println("Fail");
        }
    }
}
