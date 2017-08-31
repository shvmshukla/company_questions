/*Given an input stream of n integers the task is to insert integers to stream and print the median of the new stream formed by each insertion of x to the stream.

Example

Flow in stream : 5, 15, 1, 3 
5 goes to stream --> median 5 (5)
15 goes to stream --> median 10 (5, 15)
1 goes to stream --> median 5 (5, 15, 1)
3 goes to stream --> median 4 (5, 15, 1, 3)
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class gfg {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		int i=0;
               
		while(i<n)
		{
		   arr[i]= sc.nextInt();
		   Arrays.sort(arr );
		   
for (int p = 0; p < arr.length / 2; p++) {
  int temp = arr[p];
  arr[p] = arr[arr.length - 1 - p];
  arr[arr.length - 1 - p] = temp;
}
                    
                    
		    if((i+1)%2!=0)                       // 5,15,1,3   5,10,5,4
		      System.out.println(arr[i/2]);
		    else
		      System.out.println((arr[i/2]+arr[i/2+1])/2);
		 i++;    
		}
		
	}
}


// EFFICIENT CODE FOR THE SAME
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    /*public static void sort(int a[],int n){
        int temp;
        
        for(int j=0;j<n-1;j++){
            for(int k=j;k<n;k++){
                if(a[k]<a[j]){
                    temp=a[j];
                    a[j]=a[k];
                    a[k]=temp;
                }
            }
        }
    }*/
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		   a[i]=in.nextInt();
		   
		for(i=0;i<n;i++){
		    if(i==0)
		    System.out.println(a[i]);
		    else{
		        Arrays.sort(a,0,i+1);
		        if(i%2==0)
		        System.out.println(a[i/2]);
		        else
		        System.out.println((a[i/2]+a[i/2+1])/2);
		    }
		}
		//code
	}
}
