/*
Given two strings ‘X’ and ‘Y’, find the length of the longest common substring.

Examples :

Input : X = "GeeksforGeeks", y = "GeeksQuiz"
Output : 5
The longest common substring is "Geeks" and is of
length 5.

Input : X = "abcdxyz", y = "xyzabcd"
Output : 4
The longest common substring is "abcd" and is of
length 4.

Input : X = "zxabcdezy", y = "yzabcdezx"
Output : 6
The longest common substring is "abcdez" and is of
length 6.
 

Input:
First line of the input contains no of test cases  T,the T test cases follow.
Each test case consist of 2 space separated integers A and B denoting the size of string X and Y respectively
The next two lines contains the 2 string X and Y.


Output:
For each test case print the length of longest  common substring of the two strings .


Constraints:
1<=T<=200
1<=size(X),size(Y)<=100


Example:
Input:
2
6 6
ABCDGH
ACDGHR
3 2
ABC
AC

Output:
4
1
*/

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
     int m=sc.nextInt();
     int n=sc.nextInt();
     String str1=sc.next();
     String str2=sc.next();
     int dp[][]= new int[str1.length()+1][str2.length()+1];
     int max=0;
    for(int i=0;i<=str1.length();i++)
    {
        for(int j=0;j<=str2.length();j++)
        {
            if(i==0 ||j==0)
              dp[i][j]=0;
              
            else if(str1.charAt(i-1)==str2.charAt(j-1))
            {
                dp[i][j]=dp[i-1][j-1]+1;
            }
            else
             dp[i][j]=0;
             
        if(dp[i][j]>max)
         max=dp[i][j];
        }
    }
    
    System.out.println(max);
}
	}
}
