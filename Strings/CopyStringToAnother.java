package Strings;

public class CopyStringToAnother {
    public static void main(String[] args) {
        String s = "ExcelR";
        StringBuffer p = new StringBuffer();
        for(int i=0;i<s.length();i++){
            p = p.append(s.charAt(i));
        }
        System.out.println(p);
    }
}
