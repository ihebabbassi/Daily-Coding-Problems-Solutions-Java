import java.util.Arrays;

public class ProductExceptSelf {
    //Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i. For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelf2(nums)));
    }

    //with division
    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            output[i] = product / nums[i];
        }
        return output;
    }
    //without division
    public static int[] productExceptSelf2(int[] nums) {
        int[] output = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] = product;
            product *= nums[i];
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= product;
            product *= nums[i];
        }
        return output;
    }





}
