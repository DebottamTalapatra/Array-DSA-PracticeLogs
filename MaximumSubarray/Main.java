package MaximumSubarray;

class Solution {
    public int maxSubArray(int[] nums) {
        int MAX = Integer.MIN_VALUE;
        int tempSum = 0;
        for (int i = 0; i < nums.length; i++) {
            tempSum += nums[i];
            MAX = Math.max(tempSum, MAX);
            if (tempSum < 0) {
                tempSum = 0;
            }
        }
        return MAX;
    }
}