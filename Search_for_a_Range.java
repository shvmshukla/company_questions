/*
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
*/

public class SearchForRange {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurence(nums, target);
        if (first == -1) {
            return new int[]{-1, -1};
        }
        int last = lastOccurence(nums, target);
        return new int[]{first, last};
    }

    private int firstOccurence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (nums[mid] == target && (mid == 0 || nums[mid - 1] < target)) {
                return mid;
            } else if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private int lastOccurence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (nums[mid] == target && (mid == nums.length - 1 || nums[mid + 1] > target)) {
                return mid;
            } else if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        SearchForRange searchForRange = new SearchForRange();
        int[] nums = {0, 1, 1, 3, 6, 9, 11};
        int[] r = searchForRange.searchRange(nums, 11);
        System.out.println(r[0] + " " + r[1]);
        r = searchForRange.searchRange(nums, 0);
        System.out.println(r[0] + " " + r[1]);
    }
}

