import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int T=sc.nextInt();
	    while(T-->0){
	    String str=new String(sc.next());    
	    
	    int n = str.length();
      
        // Create a stack and push -1 as initial index to it.
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
      
        // Initialize result
        int result = 0;
      
        // Traverse all characters of given string
        for (int i=0; i<n; i++)
        {
            // If opening bracket, push index of it
            if (str.charAt(i) == '(')
              stk.push(i);
      
            else // If closing bracket, i.e.,str[i] = ')'
            {
                // Pop the previous opening bracket's index
                stk.pop();
      
                // Check if this length formed with base of
                // current valid substring is more than max 
                // so far
                if (!stk.empty())
                    result = Math.max(result, i - stk.peek());
      
                // If stack is empty. push current index as 
                // base for next valid substring (if any)
                else stk.push(i);
            }
        }
      System.out.println(result);
	 }
	 }
}
