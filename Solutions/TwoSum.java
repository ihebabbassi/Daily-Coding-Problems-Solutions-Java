public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {10, 15, 3, 7};
        System.out.println(twoSum(nums, 17));
    }

    public static boolean

        twoSum(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
