/*
Given a string s, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them causing the left and the right side of the deleted substring to concatenate together.

We repeatedly make k duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made.

It is guaranteed that the answer is unique.

Example 1:
Input: s = "abcd", k = 2
Output: "abcd"
Explanation: There's nothing to delete.

Example 2:
Input: s = "deeedbbcccbdaa", k = 3
Output: "aa"
Explanation: 
First delete "eee" and "ccc", get "ddbbbdaa"
Then delete "bbb", get "dddaa"
Finally delete "ddd", get "aa"

Example 3:
Input: s = "pbbcggttciiippooaais", k = 2
Output: "ps"

Constraints:
1 <= s.length <= 10^5
2 <= k <= 10^4
s only contains lower case English letters.
 */


class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> chars = new Stack<>();
        boolean checkAgain = true;
        
        while (checkAgain){
            int repCount = 0; //num of repeated chars
            String temp = "";
            
            for(int i = 0 ; i < s.length() ; i++){
                if(!chars.empty() && s.charAt(i) == chars.peek()){
                    repCount++;
                    chars.push(s.charAt(i));
                }else{
                    while(!chars.empty())
                        temp = temp + chars.pop();
                    chars.push(s.charAt(i));
                    repCount = 1;  
                }
                
                 if(repCount == k){
                    while(!chars.empty())
                        chars.pop(); //empties stack when k elements are inside
                }else if(i == s.length()-1 ){
                    while(!chars.empty())
                        temp = temp + chars.pop();
                }
                
            }
            
            if(s.equals(temp))
                checkAgain = false;
            
            s = temp;
            //delete removed chars from s
        }
        return s;
    }
}