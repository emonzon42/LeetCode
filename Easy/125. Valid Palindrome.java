/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:
Input: "A man, a plan, a canal: Panama"
Output: true

Example 2:
Input: "race a car"
Output: false

Constraints:
s consists only of printable ASCII characters.
*/

class Solution {
    
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
            return true;
        
        LinkedList<Character> chars = new LinkedList<>();
        String forwards = "";
        String backwards = "";
        for (int i = 0; i < s.length() ; i++ ){
            if (inAlphaNumRange(s.charAt(i))){
                 chars.add(s.charAt(i));
                forwards = forwards + s.charAt(i);
            }
        }
        
        while(!chars.isEmpty())
            backwards = backwards + chars.pollLast();
        
        //System.out.println(forwards + " | " + backwards);
        if(forwards.equalsIgnoreCase(backwards))
            return true;
         else
             return false;
    }
    
    private boolean inAlphaNumRange(char c){
        return (c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122); //all alphanumeric ascii codes
    }
}