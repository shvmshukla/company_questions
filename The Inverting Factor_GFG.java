/*package whatever //do not write package name here */

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
		    int len= sc.nextInt();
		    int arr[]= new int[len];
		    //array read
		    for(int i=0;i<len;i++)
		    {
		        arr[i]= sc.nextInt();
		    }
		   int min= Integer.MAX_VALUE;
		    
		 //reverse every element of array and push back to it
		 
        for(int i=0;i<len;i++)
		    {
		            
		            StringBuffer temp1= new StringBuffer(arr[i]+"");
		            
		            int oprnd1=Integer.parseInt(temp1.reverse().toString());
		            arr[i]=oprnd1; 
		           
		    }
		 //that is our array is now array of reversed elements
		 //sort the array   
		  Arrays.sort(arr);
		//find difference   
		 for(int i=0;i<len-1;i++)
		 {
		     min= Math.min(min,arr[i+1]-arr[i]);
		 }

		    System.out.println(min);
		}
	}
}
