//Level : Medium 
//https://leetcode.com/problems/partition-array-according-to-given-pivot/description/

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int idx = 0;

        // 1. Add elements smaller than pivot
        for (int num : nums) {
            if (num < pivot) {
                result[idx++] = num;
            }
        }

        // 2. Add elements equal to pivot
        for (int num : nums) {
            if (num == pivot) {
                result[idx++] = num;
            }
        }

        // 3. Add elements greater than pivot
        for (int num : nums) {
            if (num > pivot) {
                result[idx++] = num;
            }
        }

        return result;
    }
}
