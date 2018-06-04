
/*
Given an array, move the zeros present in it to the tail of array.
*/
//time complexity O(n), stability is take care here 
/**
 *
 * @author shivam
 */
public class move_zeros_to_end {
    public static void main(String[] args) {
        int[] arr={1,2,0,0,3,4,0,0,1,0};
       int slow=0,fast=0;
       while(fast<arr.length)
       {
           if(arr[fast]==0 )
           {
               fast++;
               continue;
           }
          arr[slow]=arr[fast];
          slow++;
          fast++;
          
       }
    
    //fill remaining pos from slow to arr.length by 0   
       for(int i=slow;i<arr.length;i++) 
      {
          arr[i]=0;
      }
       //printinf array after moving zeros to end 
       for(int i=0;i<arr.length;i++) 
      {
          System.out.print(arr[i]+" ");
      }    
    }
}

/*
1 2 3 4 1 0 0 0 0 0
*/
