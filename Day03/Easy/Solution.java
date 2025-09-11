//Level : Easy
//https://leetcode.com/problems/palindrome-number/description/

import java.lang.*;
class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int copy = x;
        if(x < 0){
            return false;
        }
        while(x!=0){
            sum = (sum*10) + (x % 10);
            x = Math.abs(x / 10);
        }
        return(sum == copy);
    }
}