/*
Given an array containing N words, you need to find the most frequent word in the array. 
If multiple words have same frequency then print the word that comes first in lexicographical order.
Input:
3
3
geeks for geeks
2
hello world
3
world wide fund

Output:
geeks
hello
fund
*/

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
		    int len= sc.nextInt();
		    String[] s= new String[len];
		    for(int i=0;i<len;i++)
		    {
		        s[i]=sc.next();
		        
		    }
		    
		    Set<String> a = new HashSet<String>();
		    HashMap<String,Integer> hmap= new HashMap<String,Integer>();
		    for(int i=0;i<len;i++)
		    {
		        if(a.add(s[i]))
		        {
		            hmap.put(s[i],0);
		        }
		    }
		    
		    for(int i=0;i<len;i++)
		    {
		        hmap.put(s[i],hmap.get(s[i])+1);
		    }
		 StringBuffer res= new StringBuffer("");
		 int max=0;
		 for (Map.Entry<String,Integer> entry : hmap.entrySet()) 
		 {
           // System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            if(entry.getValue()>max)
             {
                 
                 max= entry.getValue();
                 res= new StringBuffer(entry.getKey());
                 int polarity=res.toString().compareTo(entry.getKey());
                 if(polarity<0)
                   res= new StringBuffer(entry.getKey());
                 
             }
            if(entry.getValue()==max)
            {
                 int polarity=res.toString().compareTo(entry.getKey());
                 if(polarity>0)
                   res= new StringBuffer(entry.getKey());
            }
		 }
		    System.out.println(res);
		 }
	}
}
