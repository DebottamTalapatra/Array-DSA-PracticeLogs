package NextPermutation;

class Solution {
    public void nextPermutation(int[] nums) {
        int dipPoint = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                dipPoint = i;
                break;
            }
        }
        if (dipPoint == -1) {
            reverse(nums);
            return;
        }
        for (int i = nums.length - 1; i > dipPoint; i--) {
            if (nums[i] > nums[dipPoint]) {
                int temp = nums[i];
                nums[i] = nums[dipPoint];
                nums[dipPoint] = temp;
                break;
            }
        }
        int left = dipPoint + 1, right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

    }

    static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}