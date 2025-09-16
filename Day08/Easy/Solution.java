//Level : Easy
//https://www.geeksforgeeks.org/problems/reverse-an-array/1

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        for(int i=0;i<arr.length/2;i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
}