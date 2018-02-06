Given an array of integers, sort the array into a wave like array and return it, 
In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....

public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
     
     Integer[] arr = new Integer[A.size()];
        arr = A.toArray(arr);
        
        int i=0;
        /*int[] arr = new int[A.size()];

         for(i = 0; i < A.size(); i++) {
    if (A.get(i) != null) {
        arr[i] = A.get(i);
    }
         }*/
    
    
        Integer[] res= new Integer[A.size()];
       Arrays.sort(arr);

    i=0;
    
    int size1=1,size2=0;
     for(int j=0;j<A.size();j++)
     {
         if(i%2==0){
             if(size1<A.size()){
           res[j]= arr[size1];}
           size1+=2;
         }
         else{
             if(size2<A.size()){
           res[j]=arr[size2];}
           size2+=2;
           
         }
         i++;
     }
     if(A.size()%2!=0)
      res[A.size()-1]=arr[A.size()-1];
    /* for(int k=0;k<A.size();k++)
       {
           System.out.print(res[k]+"  ");
       }
   System.out.println("");
     */
     ArrayList<Integer> al= new ArrayList<Integer>(Arrays.asList(res)) ;
     return al;
    }
}    
