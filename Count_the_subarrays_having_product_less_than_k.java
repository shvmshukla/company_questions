/*
Given an array of positive numbers, the task is to find the number of possible contiguous subarrays having product less than a given number K.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. First line of each test case contains two integers N & K and the second line contains N space separated array elements.

Output:
For each test case, print the count of required subarrays in new line.

Constraints:
1<=T<=200
1<=N<=105
1<=K<=1015
1<=A[i]<=105

Example:
Input:
2
4 10
1 2 3 4
7 100
1 9 2 8 6 4 3

Output:
7
16

Explanation:

Input : A[]={1, 2,3,4} 
        K = 10
Output : 7
The contiguous subarrays are {1}, {2}, {3}, {4}
{1, 2}, {1, 2, 3} and {2, 3} whose count is 7.

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
 try{
 int len= sc.nextInt();
 //long k=sc.nextInt();
 
    long k=sc.nextInt();

 int a[]= new int[len];

    for(int i=0;i<len;i++)
     {
       a[i]=sc.nextInt(); 
     }
 int start=0;
 long p=1,count=0;
 for(int end=0;end<len;end++)
 {
    p*=a[end];
    
    while(p>=k && start<=end)
    {
        p/=a[start++];
    }
    
    if(p<k)
     {
         count+=end-start+1;
     }
 }
 
 System.out.println(count);
 } catch (InputMismatchException e) {
    System.out.println("Invalid argument for an int");
} 
}
	}
}
