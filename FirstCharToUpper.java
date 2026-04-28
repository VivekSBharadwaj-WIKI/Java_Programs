public class FirstCharToUpper {
    public static void main(String[] args) {
        String s1 = "excelR";
        if(s1.charAt(0)<='z' && s1.charAt(0)>='a'){
            s1 = Character.toUpperCase(s1.charAt(0)) + s1.substring(1);
        }
        System.out.println(s1);
    }
}
