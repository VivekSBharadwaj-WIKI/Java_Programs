import java.util.Arrays;
import java.util.Scanner;

public class MoreThanHalfMajority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read size
        int size = sc.nextInt();

        if (size == 0) {
            System.out.println("NO Majority Element");
            return;
        }

        // Step 2: Read array
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Sort array
        Arrays.sort(arr);

        // Step 4: Find majority
        int count = 1, maxCount = 1;
        int majorityElement = arr[0];

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] == arr[j - 1]) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    majorityElement = arr[j];
                }
            } else {
                count = 1;
            }
        }

        // Step 5: Check condition
        if (maxCount > size / 2) {
            System.out.println(majorityElement + " is the majority element with count " + maxCount);
        } else {
            System.out.println("NO Majority Element");
        }
    }
}