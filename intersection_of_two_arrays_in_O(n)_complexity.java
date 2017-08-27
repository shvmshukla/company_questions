/*
Given a couple of integer arrays A = {2, 4, 3, 5, 6, 8} & B = {9, 2, 7, 6} - 
Return the intersection of these arrays. 

Once I provided a solution (which was n squared -O (n^2)) he followed up by asking me 
if I could make it linear (O(n)).
*/


package dynamic_programming;
/*
import java.util.HashSet;
import java.util.Set;
*/
import java.util.*;
/**
 *
 * @author shivam
 */
public class intersection_of_two_arrays {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7};
        int arr2[]={1,2,8};
     Set<Integer> unique = new HashSet<Integer>();
     List<Integer> result = new ArrayList<Integer>();
  for(int element : arr1)
      unique.add(element);
  for(int element :arr2)
  {
      if(!(unique.add(element)))
          if(!result.contains(element))
              result.add(element);
  }
  
 //printing result arraylist
  
   Iterator it=result.iterator();
    while(it.hasNext()){
            System.out.println(it.next());
    }
    
  //printing result in a list
    
        System.out.println("Intesection of two arrays is :"+result);
    
    }
}

/*
OUTPUT
1
2
Intesection of two arrays is :[1, 2]
BUILD SUCCESSFUL (total time: 3 seconds)

*/
