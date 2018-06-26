import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Comparator;
public class kth_minimum_element_in_stream {
    public static void main(String[] args) {
        int arr[]={3,1,5,89,0,-1,23,2,6,-5};
        int k=3;
        
      Comparator<Integer>  c = new Comparator<Integer>()
        {
            @Override
            public int compare(Integer a,Integer b)
            {
                return b-a;
            }
        };
      PriorityQueue<Integer> queue= new PriorityQueue<Integer>(c);  //comparator object is used for max heap creation
      
      for(int i=0;i<arr.length;i++)
      {
       if(i+1<k)
       {
           queue.add(arr[i]);
           System.out.print(-1+" ");
       }
       else
       {
           if(i+1==k)
           {
               queue.add(arr[i]);
               System.out.print(queue.peek()+" ");
           }
          
          else if(queue.peek()<arr[i])
           {
               
               System.out.print(queue.peek()+" ");
           }
           else
           {
               queue.poll();
               queue.add(arr[i]);
               System.out.print(queue.peek()+" ");
           }
       }
      }
    }
}

/*
OUTPUT
run:
-1 -1 5 5 3 1 1 1 1 0 BUILD SUCCESSFUL (total time: 0 seconds)
*/
