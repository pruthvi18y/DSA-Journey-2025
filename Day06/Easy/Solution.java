//Level : Easy
//https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1

import java.util.*;

class Solution {
    public static void print_divisors(int n) {
        // code here
        List<Integer> divisors = new ArrayList<>();
        
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {  // avoid adding sqrt twice if n is a perfect square
                    divisors.add(n / i);
                }
            }
        }
        
        Collections.sort(divisors);
        
        for (int d : divisors) {
            System.out.print(d + " ");
        }
    }
}
