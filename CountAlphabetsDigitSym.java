import java.nio.channels.AcceptPendingException;

public class CountAlphabetsDigitSym {
    public static void main(String[] args) {
        String s = "Excelr@123#$%";
        int ACount = 0;
        int DCount = 0;
        int SCount = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <='z' || s.charAt(i) >= 'A' && s.charAt(i) <='Z'){
                ACount++;
            }else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                DCount++;
            }else{
                SCount++;
            }
        }
        System.out.println(ACount);
        System.out.println(DCount);
        System.out.println(SCount);
    }
}
