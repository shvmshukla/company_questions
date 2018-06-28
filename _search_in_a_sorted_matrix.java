/*
Write an efficient algorithm that searches for a value in an m x n matrix.

This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than or equal to the last integer of the previous row.
Example:

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return 1 ( 1 corresponds to true )

Return 0 / 1 ( 0 if the element is not present, 1 if the element is present ) for this problem
https://www.interviewbit.com/problems/matrix-search/
*/
----------------------------------------------------------------------------------------------------------------------------

public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        if(a == null || a.size() == 0 || a.get(0).size() == 0) {
            return 0;
        }
        int m = a.size();
        int n = a.get(0).size();
        int start = 0;
        int mid, x, y;
        int end = m * n - 1;
        while(start <= end) {
            mid = (start + end)/2;
            x = mid/n;
            y = mid % n;
            if(a.get(x).get(y) == b) {
                return 1;
            } else if(a.get(x).get(y) < b) {
                start=mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }
}
