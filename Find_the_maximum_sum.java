/*
Given an array of n elements.Find the maximum sum when the array elements will be arranged in such way.
 Multiply the elements of each pair and add to get maximum Sum. Sum could be larger so take mod with 10^9+7.

Example1: 
Input:  n=7
        -1,9,4,5,-4,-7,0
Output: 77
So to get the maximum sum,the arrangement will be {-7,-4},{-1,0},{9,5} and {4}.
So the answer is (-7*(-4))+((-1)*0)+(9*5)+(4) ={77}.

Example2:
Input:  n=3
        -1,0,1
Output: 1
So to get the maximum sum,the arrangement will be {-1,0} and {1}.So the answer is ((-1)*0)+(1)={1}.
I
*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    int i=0;
		    while(i<n)
		        a[i++]=sc.nextInt();
		    Arrays.sort(a);
		    long sum=0;
		    long prod;
		    i=0;
		    while(i+1<n&&a[i+1]<=0){
		        prod=(a[i]*a[i+1])%((int)Math.pow(10,9)+7);
		        sum=(sum+prod)%((int)Math.pow(10,9)+7);
		        i=i+2;
		    }
		    int j=n-1;
		    while(j>i){
		        prod=(a[j]*a[j-1])%((int)Math.pow(10,9)+7);
		        sum=(sum+prod)%((int)Math.pow(10,9)+7);
		        j=j-2;
		    }
		    if(j==i)
		        sum=(sum+a[i])%((int)Math.pow(10,9)+7);
		    
		 System.out.println(sum);   
		}
	}
}
