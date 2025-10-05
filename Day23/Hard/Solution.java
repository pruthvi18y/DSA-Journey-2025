//Level : Hard
//https://leetcode.com/problems/find-triangular-sum-of-an-array/description/?envType=daily-question&envId=2025-09-30

class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        // keep reducing until only one element remains
        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            n--; // shrink the effective size
        }
        return nums[0];
    }
}
