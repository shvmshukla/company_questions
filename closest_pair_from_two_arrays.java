/*
Given two arrays and a number x, find the pair whose sum is closest to x and the pair has an element from each array.

Input:
The first line consists of a single integer T, the number of test cases. For each test case, the first line contains 2 integers n & m denoting the size of two arrays. Next line contains n- space separated integers denoting the elements of array A and next lines contains m space separated integers denoting the elements of array B followed by an integer x denoting the number whose closest sum is to find.

Output:
For each test case, the output is 2 space separated integers whose sum is closest to x.  

Constraints:
1<=T<=100
1<=n,m<=50
1<=A[i],B[i]<=500

Example:
Input:
2
4 4
1 4 5 7
10 20 30 40
32
4 4
1 4 5 7
10 20 30 40
50
Output: 
1 30
7 40
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
    
    int m= sc.nextInt();
    int n= sc.nextInt();

 int a[]= new int[m];
 int b[]= new int[n];
 int ab[]= new int[m+n];
  //  System.out.println("a");
 for(int i=0;i<m;i++)
 {
     a[i]=sc.nextInt();
     
 }
  //  System.out.println("b"); 
 for(int i=0;i<n;i++)
 {
     b[i]=sc.nextInt();
     
 }
 
     int sum=sc.nextInt();
 Arrays.sort(a);
 Arrays.sort(b);

 int res_l=0,res_r=0;
 int l=0,r=n-1;
 int diff= 1000000;
 while(l<m && r>=0)
 {
    if(Math.abs((a[l]+b[r])-sum)<diff)
    {
        res_l=l;
        res_r=r;
     diff=Math.abs((a[l]+b[r])-sum); 
     //   System.out.println("diff "+diff);
    }
  // If sum of this pair is more than x, move to smaller
           // side
           if (a[l] + b[r] > sum)
               r--;
           else  // move to the greater side
               l++;    
 }
 System.out.println(a[res_l]+" "+b[res_r]);
}
	} 
}
