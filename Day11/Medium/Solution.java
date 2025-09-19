//Level : Medium
//https://leetcode.com/problems/maximum-subarray/description/

import java.util.*;

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];  // Start with the first element
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either start new subarray at i or extend previous
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }
}
