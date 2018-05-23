/*
Given an input stream of n integers the task is to insert integers to stream and print the kth largest element in the stream at each insertion.

Example:

Input:
stream[] = {10, 20, 11, 70, 50, 40, 100, 5, ...}
k = 3

Output:    {-1,   -1, 10, 11, 20, 40, 50,  50, ...}

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains two lines. The first line of each test case contains two space separated integers k and n . Then in the next line are n space separated values of the array.

Output:
For each test case in a new line print the space separated values denoting the kth largest element at each insertion, if the kth largest element at a particular insertion in the stream doesn't exist print -1.

Constraints:
1<=T<=100
1<=n,k<=1000
1<=stream[]<=100000

Example:
Input:
2
4 6
1 2 3 4 5 6
1 2
3 4 

Output:
-1 -1 -1 1 2 3
3 4 

 
*/

/**
 *
 * @author shivam
 */
import java.util.*;
import java.lang.*;
import java.io.*;

public class kth_largest_element_in_the_stream {

	public static void main (String[] args)
	{
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    int n;
	    
	    while(t-- > 0){
	        
	        int k = s.nextInt();
	        n = s.nextInt();
	        PriorityQueue<Integer> queue = new PriorityQueue<>();
	        for(int i=0; i<n; i++){
	            int buf = s.nextInt();
	            if(i+1 < k){
	                System.out.print("-1 ");
	                queue.add(buf);
	            } else if(i+1 == k){
                    queue.offer(buf);
                    System.out.print(queue.peek() + " ");
	            }else {
	                if(buf > queue.peek()){
	                    queue.poll();
	                    queue.offer(buf);
	                }
	                
	                System.out.print(queue.peek() + " ");
	            }
	            
	        }
	        
	        System.out.println();
	    }
	    
	    return;
	}
}   

