/*
Longest Sub-Array with Sum K
Input : arr[] = { 10, 5, 2, 7, 1, 9 }, 
K = 15
Output : 4
The sub-array is {5, 2, 7, 1}.
*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
	
	    
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0) {
			int n=s.nextInt();
			int k=s.nextInt();
			int arr[] = new int[n];
	        for(int i=0;i<arr.length;i++) {
	        arr[i] = s.nextInt();
	        
	        }
	        
	
	HashMap<Integer , Integer> map = new HashMap<>();
	
	int sum=0,ml=0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
		if(sum == k) {
			ml=i+1;
		}
		
		if(!map.containsKey(sum)){
            map.put(sum,i);
           // System.out.println("i::"+i);
            
        }
        if(map.containsKey(sum-k))
        {
            int x=map.get(sum-k);
            //System.out.println(x);
            if(ml<i-x){
                ml=i-x;
                
                
            }
        }
	}
	System.out.println(ml);
		}

	}
}
