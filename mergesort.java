
public class MergeSort {

    static void merge(int[] a, int first, int mid, int last) {
        int l = mid - first + 1;
        int r = last - mid;
        int[] left = new int[l];
        int[] right = new int[r];

        for (int i = 0; i < l; i++) {  //copy left
            left[i] = a[first + i];
        }
        for (int j = 0; j < r; j++) {  //copy right
            right[j] = a[mid + j + 1];
        }
        int i = 0;
        int j = 0;
        int k = first;
        while (i < l && j < r) {  //merging
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < l) {  //remainig left element
            a[k] = left[i];
            i++;
            k++;
        }
        while (j < r) {  //remainig right element
            a[k] = right[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] a, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;  //find the middle
            mergeSort(a, first, mid);  //sort left half
            mergeSort(a, mid + 1, last);  //sort right half
            merge(a, first, mid, last);  //merge above two sorted halves
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 9, 6, 7, 8};
        mergeSort(arr, 0, arr.length - 1);
        for (int element : arr) {
            System.out.println(element);
        }
    }
}


/*
The complexity of merge sort is O(nlogn).

Merge sort is a divide and conquer algorithm. Think of it in terms of 3 steps -

The divide step computes the midpoint of each of the sub-arrays. Each of this step just takes O(1) time.
The conquer step recursively sorts two subarrays of n/2 (for even n) elements each.
The merge step merges n elements which takes O(n) time.
Now, for steps 1 and 3 i.e. between O(1) and O(n), O(n) is higher. Let's consider steps 1 and 3 take O(n) time in total. Say it is cn for some constant c.

How many times are these steps executed?

For this, look at the tree below - for each level from top to bottom Level 2 calls merge method on 2 sub-arrays of length n/2 each. The complexity here is 2 * (cn/2) = cn Level 3 calls merge method on 4 sub-arrays of length n/4 each. The complexity here is 4 * (cn/4) = cn and so on ...

Now, the height of this tree is (logn + 1) for a given n. Thus the overall complexity is (logn + 1)*(cn). That is O(nlogn) for the merge sort algorithm.
*/
