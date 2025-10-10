//Level : Medium
//https://leetcode.com/problems/majority-element-ii/description/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums); // Use built-in sort for simplicity

        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > n / 3) {
                    result.add(nums[i - 1]);
                }
                count = 1;
            }
        }

        // Final check for the last element
        if (count > n / 3) {
            result.add(nums[n - 1]);
        }

        return result;
    }
}
