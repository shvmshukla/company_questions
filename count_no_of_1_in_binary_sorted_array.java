package dynamic_programming;

// 1,1,1,0,0,0,0   
public class count_no_of_1_in_binary_sorted_array {
   
    
   public static int countOne(int[] arr, int low, int high ) {
     int mid;
     if(high>=low){
     mid= low+(high-low)/2;
      if((arr[mid]==1) && (arr[mid+1]==0 || mid==high)){
          System.out.println(mid);
          return mid;}
      else if(arr[mid]==1){
          System.out.println("else if"+mid);
          return countOne( arr, (mid+1),high );} 
      else{
          System.out.println("else"+mid);
          return countOne( arr, low,(mid-1) ); }
     }     
    return 0;   
    } 
   
   //driver program
    public static void main(String[] args) {
        int arr[]= {1,1,1,0,0,0,0};
        int last_index_of_one= countOne(arr,0,6);
        System.out.println("number of 1's are"+ (last_index_of_one+1));
    }

    
}

/*
We can do this program in an easy manner by linear traversal technique but that will be done in 
time complexity O(n).
here we are using binary search technique so overall complexity will reduce to O(logn)
*/
