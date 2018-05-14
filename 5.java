/**
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"

Input: "abcda"
Output: "a" ???
 */

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String re = null;
        
        boolean[][] dp = new boolean[n][n];
        
        for(int i = n - 1; i >= 0; i--) {
            for(int j = i; j < n; j++) {
                dp[i][j] = (s.charAt(i) == s.charAt(j)) && (j - i < 3 || dp[i + 1][j - 1]);
                if(dp[i][j] && (re == null || re.length() <= j - i + 1)) {
                    re = s.substring(i, j + 1);
                }
            }
        }
        return re;
        
    }
}
