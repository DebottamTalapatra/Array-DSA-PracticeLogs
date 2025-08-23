package RearrangeArrayElementsBySign;

import java.util.Arrays;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 0);
        int posInd = 0;
        int negInd = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[posInd] = nums[i];
                posInd += 2;
            } else {
                result[negInd] = nums[i];
                negInd += 2;
            }
        }
        return result;
    }
}