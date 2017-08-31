
public class find_rank {
     public static int partition(int[] a,int start,int end)
   {
       int i=start,pi= a[end];
       int current= start;
   
     while(current<end)
     {
         if(a[current]>pi)
         {
             
             current++;
             
         }
         else
         {
           int temp= a[current];
           a[current]=a[i];
           a[i]=temp;
           i++;
           current++;
         }
      }
  
      int temp= pi;
           a[current]=a[i];
           a[i]=temp; 
    //    System.out.println(i);   
  return i;  
 } 
    
   public static int findRank(int[] a, int left,int right,int r)
   {
       
       if(left<right)
     {
    
       int p=partition(a,left,right);
       if(r==right-p+1){
           //return p;
           System.out.println( "given rank is of person who scored "+ a[p] +"marks");   
       }
       else if(r<right-p+1)
       findRank(a,p+1,right,r);
      
       else
        findRank(a,left,p-1,r-right+p-1);
       
     } 
       return -1;
   }
    
//driver program
    public static void main(String[] args) {
        int arr[]={8,4,1,2,5,6,7,3};
        int res=findRank(arr,0,arr.length-1,4);
        
    }
}

/*OUTPUT
given rank is of person who scored 5marks
BUILD SUCCESSFUL (total time: 0 seconds)

*/
