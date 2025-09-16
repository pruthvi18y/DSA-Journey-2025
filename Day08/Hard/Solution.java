//Level : Hard
//https://leetcode.com/problems/maximum-number-of-words-you-can-type/description/?envType=daily-question&envId=2025-09-15

import java.util.*;

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        for(String word: words) {
            boolean canType = true;
            for(int i=0;i<brokenLetters.length();i++) {
                if(word.indexOf(brokenLetters.charAt(i)) != -1) {
                    canType = false;
                    break;
                }
            }
            if(canType) count++;
        }
        return count;
    }
}a