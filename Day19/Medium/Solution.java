//Level : Medium
//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int max = arr[arr.length - 1];
        ArrayList<Integer> l = new ArrayList<>();
        if(arr.length == 0) {
            return l;
        }else{
            l.add(arr[arr.length - 1]);
        }
        for(int i=arr.length - 2;i>=0;i--) {
            if(arr[i] >= max) {
                l.add(0, arr[i]);
                max = arr[i];
            }
        }
        return l;
    }
}
