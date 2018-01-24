/**
 *
 * @author shivam
 */

import java.util.*;
import java.util.Comparator;
public class largest_number {
    public static void main(String[] args) {
        Integer arr[]={3,30,34,5,9};
        String res="";
        String a= "12";
       
        List<Integer> list= Arrays.asList(arr);
        Collections.sort(list, new Comparator<Integer>() {
    @Override
    public int compare(Integer x, Integer y) {
        // Intentional: Reverse order for this demo
        String p= x+"";
        String q= y+"";
        String PQ= p+q;
        String QP= q+p;
        return PQ.compareTo(QP)>0? -1:1;
    }

        
        
        });
        Iterator itr = list.iterator();
        int count_zeros=0;
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i]==0)
                 count_zeros++;
         }
        while(itr.hasNext())
        {
            
             
             res+=itr.next();
        }
        System.out.println(count_zeros);
        if(count_zeros==list.size())
             System.out.println(0);
        else
            System.out.println(res);
        
       }
}

        System.out.println(res); 
        
       }
}
