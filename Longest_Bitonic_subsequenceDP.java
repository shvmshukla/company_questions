/*
Given an array of positive integers. The task is to print the maximum length of Bitonic subsequence. 
a subsequenceof array is called Bitonic if it is first increasing, then decreasing.

Input:
First line contains T test cases. First line of every test case consists of N , denoting number of elements in an array. Second line of every test consists of elements in array.

Output:
Single line output, print the longest bitonic sequence.

Constraints:
1<=T<=100
1<=N<=100

Example:
Input:
2
5
1 2 5 3 2
8
1 11 2 10 4 5 2 1
Output:
5
*/

public class BitonicSequence {

    public int longestSequence(int arr[]){
        int lis[] = new int[arr.length];
        int lds[] = new int[arr.length];
        for(int i=0; i < arr.length; i++){
            lis[i] = 1;
            lds[i] = 1;
        }
        for(int i=1 ; i < arr.length; i++){
            for(int j=0; j < i ; j++){
                if(arr[i] > arr[j]){
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }
        
        for(int i = arr.length-2; i >=0 ; i--){
            for(int j = arr.length-1; j > i; j--){
                if(arr[i] > arr[j]){
                    lds[i] = Math.max(lds[i], lds[j] + 1);
                }
            }
        }
        int max = 0;
        for(int i=0; i < arr.length; i++){
            if(max < lis[i] + lds[i]-1){
                max = lis[i] + lds[i] -1;
            }
        }
        return max;
    }
    
    public static void main(String args[]){
        BitonicSequence bs = new BitonicSequence();
        int[] arr = {1,4,3,7,2,1,8,11,13,0};
        int r = bs.longestSequence(arr);
        System.out.print(r);
    
    }
}
