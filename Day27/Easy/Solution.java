//Level : Easy
//https://leetcode.com/problems/single-number/description/

class Solution {
    public int singleNumber(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++) {
            max = max ^ nums[i];
        }
        return max;
    }
}
