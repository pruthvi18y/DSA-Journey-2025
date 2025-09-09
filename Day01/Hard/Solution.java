package CodingClub.Day01.Hard;

class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] a=new int[2];
        for (int i=1;i<n;i++) {
            int j=n-i;
            if (noZero(i) && noZero(j)) {
                a[0] = i;
                a[1] = j;
                return a;
            }
        }
        return a;
    }
    public boolean noZero(int x) {
        while (x!=0) {
            if (x % 10 == 0) 
            return false;
            x /= 10;
        }
        return true;
    }
}