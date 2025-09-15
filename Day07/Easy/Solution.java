//Level : Easy
//https://www.geeksforgeeks.org/problems/largest-prime-factor2601/1

class Solution {
    static int largestPrimeFactor(int n) {
        int maxPrime = -1;

        // Remove factors of 2
        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }

        // Check odd factors
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }

        // If n is still > 2, then n itself is prime
        if (n > 2) {
            maxPrime = n;
        }

        return maxPrime;
    }
}
