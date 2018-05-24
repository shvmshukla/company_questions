/*
 An array element is peak if it is not smaller than its neighbors. 
 For corner elements, we need to consider only one neighbor. 
 
 For example, for input array {5, 10, 20, 15}, 20 is the only peak element. 
 For input array {10, 20, 15, 2, 23, 90, 67}, there are two peak elements: 20 and 90. 
 For sorted input array {10, 20, 30,40,50}, last element i.e. 50 is the peak index. 
 */

/**
 *
 * @author shivam
 */
public class peakElement {
    public static void main(String[] args) {
        int arr[]={2,5,7,1,0,6,13,21};
    // int arr[]={5,4,3,2,1};
    
      int low=0,high=arr.length-1;
      
      
 while(low<=high){  
     int mid= low+(high-low)/2;
    // System.out.println("mid"+mid);
    int before= Integer.MIN_VALUE;
      if(mid>0)
      {
          before=arr[mid-1];
      }
      int after= Integer.MIN_VALUE;
      if(mid<arr.length-1)
      {
          after=arr[mid+1];
      }
  
    if(arr[mid]>before && arr[mid]>after ){
            System.out.println(arr[mid]);
        break;
    }
    
    else if(before<after){
      low=mid+1;
      //  System.out.println("low"+low);
    }
    
    else{
       high=mid-1;
    //    System.out.println("high"+high);
    }
  }           
 }
}
