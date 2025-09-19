//Level : Easy
//https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1

class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = 0;
        for(int i=0;i<arr.length;i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
