/*
Given an array of integers, sort the array according to frequency of elements. 
For example, if the input array is {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12}, then modify the array to {3, 3, 3, 3, 2, 2, 2, 12, 12, 4, 5}. 
If frequencies of two elements are same, print them in increasing order.

Input:

1
5
5 5 4 6 4

Output:

4 4 5 5 6 
*/
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map.Entry;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0)
		{
		    int len= sc.nextInt();
		    int arr[]= new int[len];
		    for(int i=0;i<len;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		  HashMap<Integer,Integer> hmap= new HashMap<Integer,Integer>();
		  Set<Integer> set= new HashSet<Integer>();
		 for(int i=0;i<len;i++)
		 {
		     if(set.add(arr[i]))
		     {
		         hmap.put(arr[i],0);  //init zero every element
		     }
		 }
		 
		 for(int i=0;i<len;i++)
		 {
		     hmap.put(arr[i],hmap.get(arr[i])+1); //freq count
		 }
		 //list pe aa gayi
	//	 Set<Entry<Integer, Integer>> set1 = hmap.entrySet();

		 List<Entry<Integer,Integer>> al= new ArrayList<Entry<Integer,Integer>>(hmap.entrySet()); 
		 
		 //sort list
		Collections.sort(al, new Comparator<Map.Entry<Integer, Integer>>() {
		     public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2)
		     {
		         return o2.getValue().compareTo(o1.getValue());
		     }
		     });
		 //print arraylist values;
		  
		      for(Entry<Integer,Integer> entry: al)
		      {
		          for(int i=0;i<entry.getValue();i++)
		          {
		          System.out.print(entry.getKey()+" ");
		          }
		      }
		  
		 
		}
	}
}

//hmap pe add kro sbko zero dekr 
// freq count karo
// list pe add kro cz collections.sort use kr sakte list pe
//sort them using comparator
