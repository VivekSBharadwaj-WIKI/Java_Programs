package Strings;

public class MaxCoutnWord {
    public static void main(String[] args) {
        String s = "welcome to excelr fullstackdeveloper hii";
        int count = 0;
        int max  = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                if(count > max){
                    max = count;
                }
                sb.setLength(0);
                count = 0;
            }else{
                count++;
                System.out.println(sb.toString());
                sb.append(s.charAt(i));
            }
        }

        System.out.println(sb.toString());
        
    }
}
