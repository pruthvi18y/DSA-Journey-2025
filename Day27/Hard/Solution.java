//Level : Hard
//https://leetcode.com/problems/container-with-most-water/description/?envType=daily-question&envId=2025-10-04

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;
            max = Math.max(max, area);

            // Move the smaller height pointer inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
