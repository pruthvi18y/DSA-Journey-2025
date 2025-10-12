//Level : Easy
//https://leetcode.com/problems/maximum-number-of-balloons/

class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] hash = new int[26];
        for(int i=0;i<text.length();i++) {
            hash[text.charAt(i)-'a'] += 1;
        }
        int b = hash['b'-'a'];
        int a = hash['a'-'a'];
        int l = hash['l'-'a'] / 2;
        int o = hash['o'-'a'] / 2;
        int n = hash['n'-'a'];
        return Math.min(b,Math.min(a, Math.min(l, Math.min(o, n))));
    }
}