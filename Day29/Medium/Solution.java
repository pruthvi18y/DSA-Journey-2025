//Level : Medium
//https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1

import java.util.*;

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(n, -1));
        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements smaller or equal to arr[i]
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack not empty, top is next greater
            if (!stack.isEmpty()) {
                result.set(i, stack.peek());
            }

            // Push current element
            stack.push(arr[i]);
        }

        return result;
    }
}
