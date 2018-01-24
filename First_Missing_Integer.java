/*
Given an unsorted integer array, find the first missing positive integer.

Example:

Given [1,2,0] return 3,

[3,4,-1,1] return 2,

[-8, -7, -6] returns 1
*/
/**
 *
 * @author shivam
 */
 
 //code
import java.util. *;
public class first_missing_positive_number {
    public static void main(String[] args) {
        
    
    Integer arr[]={1,2,3,4};
    List<Integer> list = Arrays.asList(arr);
   for(int i=1;i<=4;i++)
   {
       if(list.indexOf(i)==-1)
       {
           System.out.println(i+"  ");
       }
   }
   

 }
}   
