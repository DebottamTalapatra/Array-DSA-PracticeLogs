package ProductExceptSelf;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] resultPre = new int[nums.length];
        int[] resultPost = new int[nums.length];
        resultPre[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            resultPre[i] = nums[i - 1] * resultPre[i - 1];
        }
        resultPost[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            resultPost[i] = nums[i + 1] * resultPost[i + 1];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = resultPre[i] * resultPost[i];
        }
        return result;
    }
}
