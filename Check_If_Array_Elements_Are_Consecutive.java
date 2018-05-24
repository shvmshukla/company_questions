/*
Given an unsorted array of numbers, write a function that returns true if array consists of consecutive numbers.

Examples:
a) If array is {5, 2, 3, 1, 4}, then the function should return true because the array has consecutive numbers from 1 to 5.

b) If array is {83, 78, 80, 81, 79, 82}, then the function should return true because the array has consecutive numbers from 78 to 83.

c) If the array is {34, 23, 52, 12, 3 }, then the function should return false because the elements are not consecutive.

d) If the array is {7, 6, 5, 5, 3, 4}, then the function should return false because 5 and 5 are not consecutive.

https://www.geeksforgeeks.org/check-if-array-elements-are-consecutive/

/*
METHOD1(Inefficient as it requires O(n) space complexity)
but offers less consumption of brain :p
*/
import java.util.Arrays;
import java.util.Collections;
public class array_consecutive_inefficient {
    public static void main(String[] args) {
        
        //Integer arr[]={1,5,3,2,4};
        Integer arr[]={1,5,3,2,0,-1,-2,4};
       int max=Collections.max(Arrays.asList(arr));
       int min=Collections.min(Arrays.asList(arr));
      int count=0;
      if(max-min+1==arr.length)
      {
        for(int i=0;i<arr.length;i++)
        {
            count++; 
        boolean[] visited= new boolean[arr.length];
        if(visited[arr[i]-min]==true)
        {
            System.out.println("array does not consists of consecutive numbers");
            break;
        }
        visited[arr[i]-min]=true;
            
        }
      }
      else
            System.out.println("array does not consists of consecutive numbers");
    
      if(count==arr.length)
      {
            System.out.println("array consists of consecutive numbers");
      }
    }
}
/*output
run:
array consists of consecutive numbers
BUILD SUCCESSFUL (total time: 0 seconds)
*/
/*
METHOD2:
NOTE:-
This method is highly efficient but 
 this method might not work for negative numbers. For example, it returns false for {2, 1, 0, -3, -1, -2}.
time complexity : O(n) 
  space compexity : O(1)
*/

import java.util.Arrays;
import java.util.Collections;
public class check_if_array_elements_are_consecutive {
    public static void main(String[] args) {
        
        Integer arr[]={1,5,3,2,4};
       //  Integer arr[]={1,5,3,4};
       int max=Collections.max(Arrays.asList(arr));
       int min=Collections.min(Arrays.asList(arr));
      int count=0;
      if(max-min+1==arr.length)
      {
        for(int i=0;i<arr.length;i++)
        {
            count++; 
            int j;
        //    System.out.println(arr[i]-min);
            if(arr[i]>0)
            {
                j=arr[i]-min;
            }
            else
            {
                j=-arr[i]-min;
            }
        if(arr[j]>0)
            {
                arr[j]=-arr[j];
            }
        else
            {
                System.out.println("array does not consists of consecutive numbers");
                break;
            }
            
        }
      }
      else
            System.out.println("array does not consists of consecutive numbers");
    
      if(count==arr.length)
      {
            System.out.println("array consists of consecutive numbers");
      }
    }
}

/*
METHOD3
Above solution doesn’t handle the case of negative numbers. 
So, in this post, a method with time complexity of O(n) and using O(1) space will be discussed 
which will handle the case of negative also. 
An important assumption here is elements are distinct.

step1:Find the sum of the array.
Step2:If given array elements are consecutive that means they are in AP. 
So, find min element i.e. first term of AP then calculate ap_sum = n/2 * [2a +(n-1)*d] where d = 1. 
So, ap_sum = n/2 * [2a +(n-1)]
step3:Compare both sums. Print Yes if equal, else No.
*/
// Java program to check if array elements
// are consecutive
import java.io.*;
 
class GFG {
 
    // Function to check if elements are 
    // consecutive
    static Boolean areConsecutives(int arr[],
                                      int n)
    {
        // Find minimum element in array
        int first_term = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++)
        {
            if(arr[j] < first_term)
            first_term = arr[j];
        }
 
        // Calculate AP sum
        int ap_sum = (n * (2 * first_term +
                         (n - 1) * 1)) / 2;
 
        // Calculate given array sum
        int arr_sum = 0;
        for (int i = 0; i < n; i++)
            arr_sum += arr[i];
 
        // Compare both sums and return
        return ap_sum == arr_sum;
    }
 
    // Driver code
    public static void main(String[] args)
    {
    int arr[] = { 2, 1, 0, -3, -1, -2 };
    int n = arr.length;
     
    Boolean result = areConsecutives(arr, n);
    if(result == true)
    System.out.println("Yes");
    else
    System.out.println("No");
 
    }
}






