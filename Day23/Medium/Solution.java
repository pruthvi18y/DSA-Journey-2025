//Level : Medium
//https://leetcode.com/problems/spiral-matrix/description/

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;

        while (left <= right && top <= bottom) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                l.add(matrix[top][i]);
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                l.add(matrix[i][right]);
            }
            right--;

            // Traverse bottom row (only if still valid)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    l.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse left column (only if still valid)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    l.add(matrix[i][left]);
                }
                left++;
            }
        }
        return l;
    }
}
