/*
Time Complexity: O(n^2). The time complexity looks more because of 3 nested loops.
If we take a closer look at the algorithm, we observe that k is initialized only once in the outermost loop. 
The innermost loop executes at most O(n) time for every iteration of outer most loop,
because k starts from i+2 and goes upto n for all values of j. Therefore, the time complexity is O(n^2).

https://stackoverflow.com/questions/8110538/total-number-of-possible-triangles-from-n-numbers
*/

/**
 *
 * @author shivam
 */
import java.util.Arrays;
public class no_of_triangles_in_unsorted_array {
    public static void main(String[] args) {
      //  int input[]={3, 4, 5, 6, 8, 9, 15};
         int input[]={10, 21, 22, 100, 101, 200, 300};
     //change unsorted array to sorted array 
     Arrays.sort(input);
     int count=0;
   for(int i=0;i<input.length-2;i++)
   {
     int k=i+2; 
       for(int j=i+1;j<input.length-1;j++)
       {
           while(k<input.length &&(input[i]+input[j]>input[k]))
               k++;
        
        count+=k-j-1;   
       }
           
   }
        System.out.println(count); 
    }
}

/*OUTPUT
run:
6
BUILD SUCCESSFUL (total time: 0 seconds)
*/
