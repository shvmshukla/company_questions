//Method1 :-
package dynamic_programming;
//import java.lang.*;
public class check_string_rotation {
    public static void main(String[] args) { 
        
    
  String a="waterbottle";
  String b="erbottlewat";
  boolean flag=false;
  int i= b.length()-1;  // i=5
  
  while(i!=0)
  {
      if(!((a.contains(b.substring(0,i))) && (a.contains(b.substring(i, b.length())))))
       {
                      i--;
        }
      else
      {
          flag=true;
          
          break;
      }
  }
         if(flag)
             System.out.println("yes, its a rotation");
         else
             System.out.println("No, its not  a rotation");
  
        //System.out.println(a.substring(1,3));
  }
}
//_____________________________________________________________________________________________________________________________
//method 2

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
	while(t-->0)
	{
	    String str1= sc.next();
	    String str2= sc.next();
	    
	    if(str2.concat(str2).contains(str1))
	     System.out.println(1);
	    else
	      System.out.println(0);
	}
	}
}
