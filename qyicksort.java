public class quicksort {
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
  return i;  
 } 
    
   public static void quickSort(int[] a, int left,int right)
   {
       if(left<right)
     {
    
       int pi=partition(a,left,right);
       quickSort(a,left,pi-1);
       quickSort(a,pi+1,right);
     } 
   }
    
//driver program
    public static void main(String[] args) {
        int arr[]={12,0,3,17,8,23,4};
        quickSort(arr,0,arr.length-1);
        System.out.println("sorted array is :-");
       for(int element: arr){
         System.out.print(element+"  ");
       }
           
    }
}

// youtube link for this program understanding :- https://www.youtube.com/watch?v=-7pzsM6gxgY
