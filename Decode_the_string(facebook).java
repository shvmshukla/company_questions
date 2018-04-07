/*
An encoded string (s) is given, the task is to decode it. The pattern in which the strings were encoded were as follows
original string: abbbababbbababbbab 
encoded string : "3[a3[b]1[ab]]".
*/
=============================================================================================================================

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
//code
	Scanner sc= new Scanner(System.in);
    int t= sc.nextInt();
while(t-->0)
{

    String s= sc.next();
    StringBuffer temp_str=new StringBuffer("");
    StringBuffer freq= new StringBuffer("");
    Stack<Character> stack= new Stack<Character>(); //pushing for actual string
    Stack<Character> temp= new Stack<Character>();
    Stack<Character> freq_stack= new Stack<Character>();
    stack.clear();
    temp.clear();
    freq_stack.clear();
  
  //pushing into stack 
  for(int i=0;i<s.length();i++)
  {
      
    if((s.charAt(i)!=']'))
     {
         stack.push(s.charAt(i));
         
     }
    else
    //pop stack till '[' character and push those popped characters in temp stack
    {
      
      while(stack.peek()!='[')
      {    
        char c= stack.pop();
        temp.push(c);
        
      }
       stack.pop();
    
    // frequency record karo   
     while(!stack.empty() &&Character.isDigit(stack.peek()))
       {
          freq_stack.push(stack.pop());
       }
       
      freq= new StringBuffer("");  
      
      while(!freq_stack.empty())
      {
          freq.append(freq_stack.pop());
      }
      
       int frequency= Integer.parseInt(freq.toString());
      
     
      
    //collect characters from temp stack and form a string
         temp_str=new StringBuffer("");
          while(!temp.empty())
          {
           
            temp_str.append(temp.pop());  
          }
          
      //push collected string character by character ...and that too frequecny times
        
        for(int j=0;j<frequency;j++)
        {
            for(int k=0;k<temp_str.length();k++)
            {
               
                stack.push(temp_str.charAt(k));
            }
        }
    }
          
  }
  
  while(!stack.empty())
  { 
      temp.push(stack.pop());
  }
  //System.out.print("o/p");

  while(!temp.empty())
  {
    System.out.print(temp.pop());
  }
   System.out.println(""); 
}
 
	    
	}
  }
