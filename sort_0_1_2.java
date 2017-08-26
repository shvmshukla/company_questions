
public class sort_0_1_2 {
    public static void main(String[] args) {
        
    
    int arr[]={2,2,2,1,1,1,0,0};
    int low=0;
    int high=arr.length-1;
    int mid=0,i,j;
    while(mid<=high){
    if(arr[mid]==2)
    {
        int temp=arr[high];
        arr[high]=arr[mid];
        arr[mid]=temp;
        high--;
     }
   
    else if(arr[mid]==0)
    {
        int temp=arr[low];
        arr[low]=arr[mid];
        arr[mid]=temp;
        low++;
        mid++;
        
     }
    else if(arr[mid]==1)
    {
        mid++;
    }
    
  }
 
   for(i=0;i<arr.length;i++)
   {
       System.out.print(arr[i]+"  ");
   }
}
    

}
