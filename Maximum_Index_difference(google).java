
/*
Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j].

Example :

A : [3 5 4 2]

Output : 2 
for the pair (3, 4)
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
	 int len=sc.nextInt();
	 int a[]= new int[len];
	 for(int i=0;i<len;i++)
	 {
	     a[i]=sc.nextInt();
	 }
	 
	 int low=0,high=len-1;
	int diff=0;

 for(int k=0;k<len;k++){
	 for(int i=high;i>k+diff;i--)
	 {
	    
	    if(a[i]<a[k])
	     continue;
	    else
	    {
	      diff= Math.max(diff,i-k);  //here 3 .actual len=4  
	   //   System.out.println(i-k);
	    }
	   if((len-1)>(k+1+diff)) // game khel gye es condition ko laga kar 
	     break; 
	 }
	 high=len-1;
	 
 }  
  System.out.println(diff);
	}
  }
}
// 7,3,8,10,6,5,1  
