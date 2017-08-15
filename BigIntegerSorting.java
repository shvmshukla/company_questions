import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bigsorting {

    public static void main(String[] args) {
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers that u want to take for sorting");
        int n = in.nextInt();
        String[] unsorted = new String[n];
        System.out.println("enter the numbers ");
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        // your code goes here
        BigInteger arr[]=new BigInteger[n];
        for(i=0;i<n;i++)
        {  
            long l= Long.parseLong(unsorted[i]);
            BigInteger temp= BigInteger.valueOf(l);
            arr[i]=temp;
        }
        for(i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int res=arr[i].compareTo(arr[j]);
                if(res==1)
                {
                    BigInteger temp1 = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp1;
                }
                
                
                    
            }
        }
        System.out.println("sorted sequence of bigintegers is :");
     for(i=0;i<n;i++)
     {
         System.out.println(arr[i]);
     }
    }
}


/*output
run:
Enter the numbers that u want to take for sorting
3
enter the numbers 
4567888
65435678
5678909876
sorted sequence of bigintegers is :
4567888
65435678
5678909876
BUILD SUCCESSFUL (total time: 10 seconds)

*/
