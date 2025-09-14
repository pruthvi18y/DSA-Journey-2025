//Level : Medium
//https://www.geeksforgeeks.org/problems/sieve-of-eratosthenes5242/1

import java.util.*;

class Solution {
    public int[] sieve(int n) {
        // code here
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int j = p * p; j <= n; j += p) {
                    prime[j] = false;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) list.add(i);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) result[i] = list.get(i);
        return result;
    }
}