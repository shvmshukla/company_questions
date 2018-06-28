/*
Implement int sqrt(int x).

Compute and return the square root of x.

If x is not a perfect square, return floor(sqrt(x))

Example :

Input : 11
Output : 3
//time complexity O(logn)
https://www.interviewbit.com/problems/square-root-of-integer/
*/
-----------------------------------------------------------------------------------------------------------------------------

public class Solution {
    public int sqrt(int a) {
        int low=1,high=a;
        int mid;
        if(a==1 || a==0)
         return a;
        while(low<=high)
        {
          mid=low+(high-low)/2;
          int isEqual= mid-(a/mid);
          
          if(isEqual==0)
           return mid;
          else if(isEqual>0)
           {
               high=mid-1;
           }
           else
           {
               id((mid+1)> a/(mid+1))
                return mid;
                
                low=mid+1;
           }
           
        }
       return 0;
    }
    }
