//Level : Easy
//https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1

// User function Template for Java
import java.util.*;
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum = 0;
        int copy = n;
        while (n != 0) {
            sum += Math.pow((n % 10), 3); 
            n = n / 10;
        }
        if(copy == sum) return true;
        else return false;
    }
}