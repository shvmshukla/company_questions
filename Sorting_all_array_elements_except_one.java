/*
Given an array A of positive integers, sort the array in ascending order such that element at index K in unsorted array stays unmoved and all other elements are sorted.

Input:
The first line contains an integer T, number of test cases. For each test case, there is an integer n denoting the size of the array A. Next line contains n space separated integers denoting the elements of the array. Next line contains an integer k denoting the index.

Output:
For each test case, the output is the sorted array except the element at index k.

Constraints:
1<=T<=100
1<=n<=50

Example:
Input
2
6
10 4 11 7 6 20
2
3
30 20 10
0
Output
4 6 11 7 10 20
30 10 20
*/

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
    int a[]= new int[len];
 for(int i=0;i<len;i++)
 {
     a[i]=sc.nextInt();
 }
 int freeze_index= sc.nextInt();
 int cold_element= a[freeze_index];
 int temp[]= new int[len-1];
 int j=0;
 for(int i=0;i<len;i++)
 {
     if(i!=freeze_index)
     {
         temp[j++]=a[i];
     }
     else
      continue;
 }
 Arrays.sort(temp); 
 
 j=0;
 for(int i=0;i<freeze_index;i++)
 {
    a[i]=temp[j++]; 
 }
 for(int i=freeze_index+1;i<len;i++)
 {
    a[i]=temp[j++]; 
 }
 
 a[freeze_index]=cold_element;

 for(int i=0;i<len;i++)
{
    System.out.print(a[i]+" ");
}
System.out.println("");
}


	}
}
