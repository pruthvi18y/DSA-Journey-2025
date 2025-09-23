//Level : Hard
//https://leetcode.com/problems/count-elements-with-maximum-frequency/description/?envType=daily-question&envId=2025-09-22
import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.keySet().contains(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
        }
        int max = Collections.max(map.values());
        int res = 0;
        for(int num: map.keySet()){
            if(map.get(num) == max){
                res += max;
            }
        }
        return res;
    }
}