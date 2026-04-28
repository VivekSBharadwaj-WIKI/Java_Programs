package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "ExcelR";
        String p = "";
        for(int i=0;i<s.length();i++){
            p = s.charAt(i)+p;
        }
        System.out.println(p);
    }
}
