package Strings;

public class FirstCharIsVowel {
    public static void main(String[] args) {
        String s = "excelR";
        String m = "aeiouAEIOU";
        if(m.indexOf(s.charAt(0)) != -1){
            System.out.println("First character of the string is vowel");
        }else{
            System.out.println("This first character of the string is consonant");
        }
    }
}
