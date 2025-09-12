//Level : Hard
//https://leetcode.com/problems/sort-vowels-in-a-string/description/?envType=daily-question&envId=2025-09-11

class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int[] freq = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                freq[ch]++;
            }
        }
        int ptr = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (isVowel(sb.charAt(i))) {
                while (ptr < 128 && freq[ptr] == 0) {
                    ptr++;
                }
                sb.setCharAt(i, (char) ptr);
                freq[ptr]--;
            }
        }
        
        return sb.toString();
    }

    private boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
               ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
