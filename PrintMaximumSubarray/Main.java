package PrintMaximumSubarray;

class Solution {
    public int maxSubArray(int[] nums) {
        int MAX = Integer.MIN_VALUE;
        int tempSum = 0;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        for (int i = 0; i < nums.length; i++) {
            if (tempSum == 0) {
                start = i;
            }
            tempSum += nums[i];
            if (tempSum > MAX) {
                MAX = tempSum;
                ansStart = start;
                ansEnd = i;
            }
            if (tempSum < 0) {
                tempSum = 0;
            }
        }
        return MAX;
    }
}
