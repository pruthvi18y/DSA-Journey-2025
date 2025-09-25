//Level : Medium 
//https://leetcode.com/problems/count-and-say/description/

class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";  // Base case
        
        String result = "1";  // Start with countAndSay(1)
        
        for (int i = 2; i <= n; i++) {
            result = getNext(result);
        }
        
        return result;
    }

    // Helper function to perform run-length encoding
    private String getNext(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }
        
        // append last run
        sb.append(count).append(s.charAt(s.length() - 1));
        
        return sb.toString();
    }
}
