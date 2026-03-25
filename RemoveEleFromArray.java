class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {1,6,9,4,2,8,7,3,5};
        int val = 3;

        int newLength = obj.removeElement(nums, val);

        // print only valid part
        System.out.println("New length: " + newLength);
        System.out.print("Updated array: ");

        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}