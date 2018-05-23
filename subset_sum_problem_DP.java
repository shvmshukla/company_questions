/*
part1:
part2:
Given a set of numbers, check whether it can be partitioned into two subsets such that the sum of elements in both subsets is same or not.

Input:The first line contains an integer 'T' denoting the total number of test cases. Each test case constitutes of two lines. First line contains 'N', representing the number of elements in the set and the second line contains the elements of the set.
Output: Print YES if the given set can be partioned into two subsets such that the sum of elements in both subsets is equal, else print NO.
Constraints: 

1 <= T<= 100
1 <= N<= 100
0 <= arr[i]<= 1000

                   
Example:

Input:
2
4
1 5 11 5
3
1 3 5 

Output:

YES
NO
*/

public class SubsetSum {

    public boolean subsetSum(int input[], int total) {

        boolean T[][] = new boolean[input.length + 1][total + 1];
        for (int i = 0; i <= input.length; i++) {
            T[i][0] = true;
        }

        for (int i = 1; i <= input.length; i++) {
            for (int j = 1; j <= total; j++) {
                if (j - input[i - 1] >= 0) {
                    T[i][j] = T[i - 1][j] || T[i - 1][j - input[i - 1]];
                } else {
                    T[i][j] = T[i-1][j];
                }
            }
        }
        return T[input.length][total];

    }

    public static void main(String args[]) {
        SubsetSum ss = new SubsetSum();

        int arr1[] = {2, 3, 7, 8};
        System.out.print(ss.subsetSum(arr1, 11));

    }
}
###########################################################################################################################

//Part2:
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
    int n=sc.nextInt();
    int arr[]= new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
  int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        if (sum % 2 != 0) {
            System.out.println("NO");
            break;
        }
        sum = sum / 2;
        boolean[][] T = new boolean[arr.length + 1][sum + 1];

        for (int i = 0; i <= arr.length; i++) {
            T[i][0] = true;
        }

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j - arr[i - 1] >= 0) {
                    T[i][j] = T[i - 1][j - arr[i - 1]] || T[i - 1][j];
                } else {
                    T[i][j] = T[i-1][j];
                }
            }
        }
        if(T[arr.length][sum])
         System.out.println( "YES");
        else
         System.out.println( "NO");
    }       
    
}
	}
