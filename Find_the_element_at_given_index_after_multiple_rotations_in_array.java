/*
Given an array consisting of N elements. There are several right circular rotations of range [L..R] that we have to perform on array. After performing these rotations, we need to find element at a given index X.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of three lines. First line of each test case contains three integers N, X  and K. Second line contains N space separated array elements and third line contains K ranges [L,R] on which we have to rotate the array in right circular manner.

Output:
For each test case, print the array[X] element after K rotations in new line.

Constraints:
1<=T<=100
2<=N,K<=105
0<=L<=R

Example:
Input:
2
5 1 2
1 2 3 4 5
0 2 0 3
3 2 1
1 2 3
0 1

Output:
3
3
*/


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int input = in.nextInt();
		while (input>0) {
		    int n = in.nextInt();
		    int x = in.nextInt();
		    int k = in.nextInt();
		    int[] arr = new int[n];
		    for(int i = 0; i < n; i++) {
		    	arr[i] = in.nextInt();
		    }
		    for(int i = 0; i < k; i++) {
		    	rotate(arr, in.nextInt(), in.nextInt());
		    }
		    System.out.println(arr[x]);
		    input--;
		}
	}
	
	public static void rotate(int[] arr, int start, int end) {
		for(int i = end; i > start; i--) {
			swap(arr, i, i-1);
		}
		
	}
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
