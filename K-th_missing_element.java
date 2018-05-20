/*
Given an increasing sequence a[], we need to find the K-th missing contiguous element in the increasing sequence which is not present in the sequence. If no k-th missing element is there output -1.

Input:
The first line consists of an integer T i.e. the number of test cases. The first line of each test case consists of two integers N and K.Next line consists of N spaced integers.

Output: 
For each test case, print the Kth missing number if present otherwise print -1.

Constraints:
1<=T<=100
1<=N,K,A[i]<=105

Examples:
Input
2
5 2
1 3 4 5 7
6 2 
1 2 3 4 5 6 
Output
6
-1

Explanation:
#TestCase 1:
  K=2
We need to find the 2nd missing number in the array. Missing numbers are 2 and 6. So 2nd missing number is 6.
#Testcase 2:
K=2
We need to find the 2nd missing number in the array. As there is no missing number, hence the output is -1.
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class Jemi
 {
	public static void main (String[] args)
	 {
	 int n,k,i,t,z,j,x,cou=0,diff;
	 Scanner in = new Scanner(System.in);
	 t=in.nextInt();
	 for(j=0;j<t;j++){
	 n = in.nextInt();
	 k= in.nextInt();
	 int a[] = new int[n];
	 int miss=-1,count=0;
	 for(z=0;z<n;z++)
	 {
	     a[z] = in.nextInt();
	 }
	  count=k;
	 for(i=0;i<n-1;i++)
	 {
	     diff=0;
	   
	     if(a[i+1]!=a[i]+1){
	         
	         diff=diff+(a[i+1]-a[i])-1;}
	         if(diff>=count){
	         miss=a[i]+count;
	         cou=1;
	         break;
	         }
	         else
	             count=count-diff;
	             
	         }
	      
	        if(cou==1)
	       System.out.println(miss);
	       else
	       System.out.println("-1");
	     
	 
	 
	 }
	 }
	 
}

/*package whatever //do not write package name here (advice:dont add while loop to increase complexity..
so think another method to solve this que which is given above)*/
/*
 this is code written by me 
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
    
    int N= sc.nextInt();
    int a[]= new int[N];
    int k= sc.nextInt();
    int flag=0;
 for(int i=0;i<N;i++)
 {
     a[i]=sc.nextInt();
 }
 

  int expectation=a[0],i=0;    
  while(i<N)
   {
      flag=0;
      while(expectation!=a[i])
      {
           // System.out.println("helloe" +expectation+"   helloi "+i+ "helloa" +a[i]);   
          k--; //for a missing value decrement k by 1
          if(k==0)
           {
            System.out.println(expectation);   
            break;
           }    
          ++expectation; //increase expectation
          flag=1;
         
      }
     //if(flag==0)
        expectation++; //increase expectation if not gone in while loop 
    i++; 
   // System.out.println(i);
   }
  if(k!=0)
    System.out.println(-1);   
}
	}
}
*/
