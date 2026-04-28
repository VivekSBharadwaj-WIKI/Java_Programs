package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "care";
        String p = "race";

        char[] m = s.toCharArray();
        char[] n = p.toCharArray();

        Arrays.sort(m);
        Arrays.sort(n);

        if (Arrays.equals(m, n)) {
            System.out.println("It is anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }
}