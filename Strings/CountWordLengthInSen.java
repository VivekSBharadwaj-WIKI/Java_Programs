package Strings;

public class CountWordLengthInSen {
    public static void main(String[] args) {
        String s = "welcome to excelr fullstackdeveloper";
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                System.out.println(count);
                count = 0;
            }else{
                count++;
            }
        }
    }
}
