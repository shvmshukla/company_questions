
public class lis {
    public static void main(String[] args) {
        int arr[]={1,101,2,3,100,4,5};
        int i,j;
        int T[]=new int[arr.length];
       
        for(i=0;i<arr.length;i++)
        {
          T[i]=1;  
        }
        int max_sum=0;
      for(i=1;i<arr.length;i++)
      {
           int sum=0;
          for(j=0;j<=i;j++)
          {
              if(arr[j]<=arr[i])
              { 
                sum+=arr[j];  
                  if(T[j]+1>T[i])
                      T[i]=T[j]+1;
              }
          }
          System.out.println("__"+sum+"__");
         if(sum>=max_sum)
             max_sum=sum;
      }
      
    for(i=0;i<T.length;i++)
    {
        System.out.print(T[i]+"  ");
       
    }
     System.out.println("|"+max_sum+"  ");
   }
  
}
