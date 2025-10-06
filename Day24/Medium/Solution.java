//Level : Medium
//https://leetcode.com/problems/subarray-sum-equals-k/description/
import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // to handle subarrays starting from index 0

        for (int num : nums) {
            sum += num;

            // if (sum - k) seen before, it means subarray sum = k exists
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // update hashmap with current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
