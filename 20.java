/**
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
 */

 class Solution {
    public boolean isValid(String s) {
        boolean flag = true;
        Stack<Character> ss = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(') 
                ss.push(')');
            else if(c == '{')
                ss.push('}');
            else if(c == '[')
                ss.push(']');
            else {
                if(ss.isEmpty() || ss.pop() != c ) return false;
            }
        }
        return ss.isEmpty();
    }
}