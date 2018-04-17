/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamic_programming;

import java.util.*;
import java.util.Map.Entry;

public class frequency_sort_using_hash_map {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int arr[]= {2,5,3,1,2,2,3,5,32,94,94,2,67,54,65,67};
        int index=1;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (Integer a : arr) {
			hm.put(index,a);
                        index++;
			
		}
                
                
  /*      
                
         HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(1, 2);
        hm.put(2, 4);
        hm.put(3, 8);
        hm.put(4, 4);
        hm.put(5, 8);
        hm.put(6, 9);
        hm.put(7, 9);
        hm.put(8, 8);
        hm.put(9, 17);
    */    
               
        Set<Entry<Integer, Integer>> set = hm.entrySet();
        
       //we are storing everything in the list because  
        List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(
                set);
        
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            
            public int compare(Map.Entry<Integer, Integer> o1,Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        
      
        for (Entry<Integer, Integer> entry : list) {
            System.out.print(entry.getValue() +"  " );

        }
        
        
    }
}

