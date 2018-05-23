/*
Count all distinct pairs with difference equal to k
Given an integer array and a positive integer k, count all distinct pairs with difference equal to k.

Examples:

Input: arr[] = {1, 5, 3, 4, 2}, k = 3
Output: 2
There are 2 pairs with difference 3, the pairs are {1, 4} and {5, 2} 

Input: arr[] = {8, 12, 16, 4, 0, 20}, k = 4
Output: 5
There are 5 pairs with difference 4, the pairs are {0, 4}, {4, 8}, 
{8, 12}, {12, 16} and {16, 20} 

https://www.geeksforgeeks.org/count-pairs-difference-equal-k/
1) Initialize count as 0
2) Sort all numbers in increasing order.
3) Remove duplicates from array.[optional step]
4) Do following for each element arr[i]
   a) Binary Search for arr[i] + k in subarray from i+1 to n-1.
   b) If arr[i] + k found, increment count. 
5) Return count. 
*/
public class CountNDistinctPairsWithDifferenceK {

    public int count(int arr[],int k){
        Arrays.sort(arr);
        int count = 0;
        for(int i=0; i < arr.length; i++){
            boolean result = binarySearch(arr, i+1, arr.length-1, arr[i] + k);
            if(result){
                count++;
            }
        }
        return count;
    }
    
    private boolean binarySearch(int arr[],int start,int end,int num){
        if(start > end){
            return false;
        }
        int mid = (start + end)/2;
        if(arr[mid] == num){
            return true;
        }
        else if(arr[mid] > num){
            return binarySearch(arr,start,mid-1,num);
        }else{
            return binarySearch(arr,mid+1,end,num);
        }
    }
    
    public static void main(String args[]){
        CountNDistinctPairsWithDifferenceK cn = new CountNDistinctPairsWithDifferenceK();
        int arr[] = {1,2,3,4,5,7,9};
        System.out.print(cn.count(arr, 3));
    }
}
