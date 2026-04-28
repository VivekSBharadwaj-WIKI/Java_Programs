package Strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "malayalam";
        String p = "";
        for(int i=0;i<s.length();i++){
            p = s.charAt(i) + p;
        }
        if(s.equals(p)){
            System.out.println("String is a palindrome String");
        }else{
            System.out.println("String is not a palindrome String");
        }
    }
}
