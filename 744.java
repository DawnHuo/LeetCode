/**
Given a list of sorted characters letters containing only lowercase letters, and given a target letter target, find the smallest element in the list that is larger than the given target.

Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.
 */

 class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, h = letters.length - 1;
        while(l <= h) {
            int m = l + (h - l)/2;
            if(letters[m] > target)
                h = m - 1;
            else 
                l = m + 1;
        }
        return l < letters.length ? letters[l] : letters[0];
    }
}