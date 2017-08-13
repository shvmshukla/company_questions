package dynamic_programming;

import java.util.Stack;
public class paranthesis_checker {
      
 public static void main(String[] args) {        
    String str = "({{}}[])";
   boolean flag=true;
    Stack<Character> s= new Stack<Character>();
    char c;
     
    for(int i=0;i<str.length();i++)
    {
        c= str.charAt(i);
         if(c=='(' || c=='{' || c=='[')
            s.push(c);
         
         else {
             if(c== ')')
             {
                if(s.peek()=='(')
                    s.pop();
                else{
                    flag=false;
                    break;
                    }
              }  
             if(c== '}')
             {
                if(s.peek()=='{')
                    s.pop();
                else{
                    flag=false;
                    break;
                    }
              } 
             if(c== ']')
             {
                if(s.peek()=='[')
                    s.pop();
                else{
                    flag=false;
                    break;
                    }
              } 
               }
      }
    if(flag==false)
         System.out.println("not balanced");
    else
         System.out.println("balanced");
 }
}
