package dynamic_programming;

import java.util.Arrays;

public class pythagorean_triplet {
    public static void main(String[] args) {
        int arr[]={24,12,25,6,7};
        int i,j;
        boolean flag=false;
        for(i=0;i<arr.length;i++)
        {
            arr[i]=(int)Math.pow(arr[i],2);
        }
    Arrays.sort(arr);  //[4,9,16,25,36]
    for(i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+"  ");
    }
    //logic 
    int high=arr.length-1;  
    while(high!=1){
    for(i=0;i<=high-2;i++)
    {
        for(j=i+1;j<=high-1;j++)
        {
           if(arr[i]+arr[j]==arr[high]){
               flag=true;
               System.out.println("yes");
               break;
           }
        }
     }
    --high;
    }
    if(flag)
            System.out.println("yes");
    else
        System.out.println("No");
    }
    
}
