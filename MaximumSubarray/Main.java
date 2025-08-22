package MaximumSubarray;

class Solution {
    public int maxSubArray(int[] nums) {
        int current = 0;
        int max_sum = nums[0];

        int i = 0;
        while (i < nums.length) {
            if (current < 0) {
                current = 0;
            }
            current += nums[i];
            max_sum = Math.max(max_sum, current);
            i++;
        }
        return max_sum;
    }
}