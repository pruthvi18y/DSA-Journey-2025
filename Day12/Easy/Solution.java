//Level : Easy
//https://www.geeksforgeeks.org/problems/second-largest3735/1

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = arr[0];
        int max2 = -1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] < max && arr[i] > max2) {
                max2 = arr[i];
            }
            if(arr[i] > max) {
                max2 = max;
                max = arr[i];
            }
        }
        return max2;
    }
}
