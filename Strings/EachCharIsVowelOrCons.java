package Strings;

public class EachCharIsVowelOrCons {
    public static void main(String[] args) {
        String s = "excelR";
        String m = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            if (m.indexOf(s.charAt(i)) != -1) {
                System.out.println(s.charAt(i) + " character of the string is vowel");
            } else {
                System.out.println(s.charAt(i) + " character of the string is consonant");
            }
        }
    }
}
