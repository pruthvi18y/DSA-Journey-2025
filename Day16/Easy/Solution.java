//Level : Easy
//https://leetcode.com/problems/roman-to-integer/description/
 
import java.util.*;

class Solution {
    public int romanToInt(String s) {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            int val = map.get(s.charAt(i));
            if (i > 0 && val > map.get(s.charAt(i - 1))) {
                res += val - 2 * map.get(s.charAt(i - 1));
            } else {
                res += val;
            }
        }
        return res;
    }
}
