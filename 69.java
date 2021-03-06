/**
Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

Example 1:

Input: 4
Output: 2
Example 2:

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since 
             the decimal part is truncated, 2 is returned.
 */
 
class Solution {
    public int mySqrt(int x) {
        if(x <= 1) return x;
        int l = 1, h = x, m;
        while(l <= h) {
            m = l + (h - l)/2;
            int sqrt = x / m;
            if(m == sqrt) return m;
            else if(sqrt > m)
                l = m + 1;
            else 
                h = m - 1;
        }
        return h;
    }
}