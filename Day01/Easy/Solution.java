package CodingClub.Day01.Easy;
// Level : Easy
// https://www.geeksforgeeks.org/problems/count-digits-1606889545/1
class Solution {
    public int countDigits(int n) {
        // code here
        int count = 0;
        if(n == 0) return 1;
        while(n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}