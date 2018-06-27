/*
You are given a string. The only operation allowed is to insert characters in the beginning of the string. How many minimum characters are needed to be inserted to make the string a palindrome string

Example:
Input: ABC
Output: 2
Input: AACECAAAA
Output: 2

Efficient Approach : Start checking the string each time if it is palindrome, and if not, then delete the last character 
and check again. After deleting count number of characters from the last i.e., the characters to be added to front, there 
will be a string which will be palindrome.
*/
---------------------------------------------------------------------------------------------------------------------------

public class Solution {
    boolean isPallindrome(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(str.length()-i-1))
             continue;
            else
              return false;
        }
        
        return true;
    }
    public int solve(String A) {
        StringBuffer sb= new StringBuffer(A);
        int count=0;
        while(sb.length()>0)
        {
            if(isPallindrome(sb.toString())==false)
             {
                sb.deleteCharAt(sb.length()-1);
                count++;
             }
             else
             {
                 break;
             }
        }
    return count;    
    }
}
