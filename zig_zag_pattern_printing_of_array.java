

package dynamic_programming;

import java.util.Arrays;

/**
 *
 * @author shivam
 */
public class zig_zag_patter_printing_of_array {
    
    public static void main(String[] args) {
        
    
    int arr[]= {8,1,2,3,4,45,32,12,100,16};
    int i=0;
    Arrays.sort(arr);
    
  
   for(i=0;i<arr.length-1;i++)
   {
      if(i%2==0)
      {
        if(arr[i]>arr[i+1])
        {
            //swap(arr[i],arr[i+1]);
            int temp= arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
      }
      else
      {
         if(arr[i]<arr[i+1])
        {
            //swap(arr[i],arr[i+1]);
            int temp= arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        } 
      }
    }
  for(i=0;i<arr.length;i++)
  {
      System.out.print(arr[i]+"  ");
  }
 }

    
}
