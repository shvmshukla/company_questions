/*Given a positive integer which fits in a 32 bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.

Example

Input : 4
Output : True  
as 2^2 = 4. 
*/

public class Solution {
    public boolean isPower(int a) {
        if(a == 1)
            return true;
            
        if(a < 4)
            return false;
            
        for(int i = 2; i <= Math.sqrt(a); i++){
            if(isPow(a, i)){
                return true;
            }
        }
        
        return false;
    }
    
    public boolean isPow(int a, int b){
        
        while(a >1){
            if(a%b == 0){
                a = a/b;
            } else {
                return false;
            }
        }
        return true;
    }
}
