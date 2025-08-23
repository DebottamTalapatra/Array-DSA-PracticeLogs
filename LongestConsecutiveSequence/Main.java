
import java.util.* ;

class Solution {
    static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        
        HashSet<Integer> set = new HashSet<>();
        int MAX_COUNT = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for (int num : set) {
            if(set.contains(num-1)){
                continue;
            }
            int i=1;
            int count=1;
            while(set.contains(num+i)){
                count++;
                i++;
            }
            MAX_COUNT = Math.max(MAX_COUNT,count);
        }
        return MAX_COUNT;
    }
}