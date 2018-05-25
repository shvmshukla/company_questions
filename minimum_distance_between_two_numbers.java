/**
 * http://www.geeksforgeeks.org/find-the-minimum-distance-between-two-numbers/
 */
//time complexity : O(n)
/*
STEPS:
1) Traverse array from left side and stop if either x or y is found. Store index of this first occurrence 
in a variable say prev.
2) Now traverse arr[] after the index prev. If the element at current index i matches with either x or y then check if it is different from arr[prev]. If it is different then update the minimum distance if needed. 
If it is same then update prev i.e., make prev = i.
*/
public class MinimumDistanceBetweenTwoNumbers {

    public int minDistance(int input[],int x, int y){
        int prev = -1;
        int prevFound = -1;
        int min = 10000;
        for(int i=0; i < input.length; i++){
            if(input[i] == x){
                if(prevFound == -1){
                    prevFound = x;
                    prev = i;
                }else if(prevFound == x){
                    prev = i;
                }else{
                    min = min > i - prev ? i -prev : min;
                    prev = i;
                    prevFound = x;
                }
            }else if(input[i] == y){
                if(prevFound == -1){
                    prevFound = y;
                    prev = i;
                }else if(prevFound == y){
                    prev =i;
                }else{
                    min = min > i - prev ? i -prev : min;
                    prevFound = y;
                    prev = i;
                }
            }
        }
        return min;
    }
    
    public static void main(String args[]){
        MinimumDistanceBetweenTwoNumbers mdb = new MinimumDistanceBetweenTwoNumbers();
        int input[] = {6,4,1,5,6,9,10,4,6,6};
        System.out.println(mdb.minDistance(input, 5, 6));
    }
}
