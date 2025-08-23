package ArrayLeader;

import java.util.Collections;
import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[arr.length - 1]);
        int MAX = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 00; i--) {
            if (arr[i] >= MAX) {
                MAX = arr[i];
                result.add(arr[i]);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
