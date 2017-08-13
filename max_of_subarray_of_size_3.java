package dynamic_programming;

public class max_of_subarray_of_size_3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,4,5,2,3,6};
       //size of subarray is 3
        int max,i=0,low=0,high=low+3;
    while(i<=6)
    {   
        max=arr[low];
        for(int j=low;j<high;j++)
        {
         // max=arr[low];
          if(arr[j]>max)
              max=arr[j];
        }
       low++;high++;i++; 
       System.out.print(max+"  ");        
    }
   }
    
}

//output  3 3 4 5 5 5 6
