/*
Given a sorted array and a value x, the ceiling of x is the smallest element in array greater than or equal to x, 
and the floor is the greatest element smaller than or equal to x. Assume than the array is sorted in non-decreasing order. 
Write efficient functions to find floor and ceiling of x.

Examples :

For example, let the input array be {1, 2, 8, 10, 10, 12, 19}
For x = 0:    floor doesn't exist in array,  ceil  = 1
For x = 1:    floor  = 1,  ceil  = 1
For x = 5:    floor  = 2,  ceil  = 8
For x = 20:   floor  = 19,  ceil doesn't exist in array
*/
/**
 *
 * @author shivam
 */


public class floor {
    public static void main(String[] args) {
     int arr[]={1,4,6,10,14,17,23};
     int x= 15;
    
    int low=0,high=arr.length-1;
    while(low<=high)
    {
     int mid=low+(high-low)/2;
     if((arr[mid]==x) || (arr[mid]<x && ((mid+1==arr.length) || arr[mid+1]>x  )))
     {
         System.out.println(arr[mid]);
         break;
     }
     
     else if(arr[mid]>x)
     {
         high=mid-1;
     }
     else
     {
         low=mid+1;
     }
    }
   }
}
