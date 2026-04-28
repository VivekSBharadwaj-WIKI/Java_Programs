public class MissingNumberInArray {
    public static void main(String[] args) {
        int n[] = { 1, 2, 4, 5 };
        //!This is method 1
        int ESum = (n.length + 1) * ( n.length + 2) / 2;
        int AS = 0;
        for (int num : n) {
            AS += num;
        }
        int M = ESum - AS;
        System.out.println("Missing number: " + M);
        //! This is method 2
        for (int i = 1; i < n.length; i++) {
            if (n[i] - n[i - 1] != 1) {
                System.out.println("Missing number: " + (n[i - 1] + 1));
                break;
            }
        }
    }
}