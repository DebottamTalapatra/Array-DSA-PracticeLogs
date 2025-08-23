import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                numbers.add(nums[i]);
            }
            set.add(nums[i]);
        }

        return numbers;
    }
}