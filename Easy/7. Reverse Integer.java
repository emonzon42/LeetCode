/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321

Example 2:
Input: -123
Output: -321

Example 3:
Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

class Solution {
    public int reverse(int x) {
        long returnVal = 0;
        String reverseStr = "";
        
        if (x <= Math.pow(-2,31) || x >= Math.pow(2,31) - 1)
            return 0;
        else if (x < 0){ //Negative
            String temp = String.valueOf(x*-1);
            for(int i = temp.length()-1; i > -1; i--)
                reverseStr = reverseStr + temp.substring(i,i+1);
            
            returnVal = Long.parseLong(reverseStr) * -1;
        }else if (x > 0){ //Positive
            String temp = String.valueOf(x);
            
            for(int i = temp.length()-1; i > -1; i--)
                reverseStr = reverseStr + temp.substring(i,i+1);
            
            returnVal = Long.parseLong(reverseStr);
        }
        
        if(returnVal <= -Math.pow(2,31) || returnVal >= Math.pow(2,31) - 1) 
            return 0;//Overflow
        else
            return (int) returnVal;
    }
}