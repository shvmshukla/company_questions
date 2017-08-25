/*Find the unique number that is present only once in array while all the others are present three times. 
Example: 2,3,5,1,2,2,5,3,5,3 
Answer : 1 as 2,3,5 are repeated three times 
Complexity should be better than O(nlogn)

- Rahul Sharma November 03, 2014 in India | Report Duplicate | Flag 
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamic_programming;
//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class hashmap {
	public static void main(String [] args)
	{
		
          int arr[]= {2,5,3,1,2,2,3,23,5};
 
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (Integer a : arr) {
			if(hmap.containsKey(a))
			{
				int i=hmap.get(a).intValue();
				hmap.put(a, i+1);
			}
			else
			{
				hmap.put(a, 1);
			}
		}
		for(Entry<Integer, Integer> e:hmap.entrySet())
		{
			if(e.getValue().equals(1))
			{
				System.out.println(e.getKey());
			}
		}
		
	}
}
