// https://www.youtube.com/watch?v=2Bn5uBnmptU&list=PLeIMaH7i8JDjd21ZF6jlRKtChLttls7BG&index=20

public class element_which_occurs_odd_no_of_times {
    public static void main(String[] args) {
        int arr[]={1,1,2,1,1,6,7,8,4,6,4,7,8,2,1};
        int res=0;
     
        for(int i=0;i<arr.length;i=i+2)
        {
           if(i+1!=arr.length)
           {     
            res=res^(arr[i]^arr[i+1]);
            
           }
           else
           {
               res^=arr[i];
            
           }
        } 
        if(res==0)
         System.out.println("No number occured odd number of times");
       else
         System.out.println("The number which occured odd number of time is "+res);   

    }
}
/*
run:
The number which occured odd number of time is 1
BUILD SUCCESSFUL (total time: 0 seconds)


*/
