
/*
Given an array A[] of n elements. 
The task is to complete the function which returns true if triplets exists in array A[] whose sum is zero else returns false.
Example(To be used only for expected output) :
Input:
2
5
0 -1 2 -3 1
3
1 2 3
Output:
1
0
*/

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/

class GfG
{
	public boolean findTriplets(int arr[] , int n)
       {
         //add code here.
        
            Arrays.sort(arr);
            boolean found = false;
            for (int i=0;i<n&&found==false;i++){
                int l = i+1,r = n-1;
                while (l<r){
                    int curSum = arr[i]+arr[l]+arr[r];
                    if (curSum==0){
                        //System.out.println("1");
                        found = true;
                        break;
                    }
                    else if (curSum>0){
                        r--;
                    }
                    else {
                        l++;
                    }
                }
            }
            return found;

        
       }
}

second method :-
class GfG
{
	public boolean findTriplets(int arr[] , int n)
       {
         Arrays.sort(arr);
		int count = 0;
		// -3 -2 -1 1 2 3
		for (int j = 0; j <= n - 2; j++) {
			int a = j + 1;
			int b = n - 1;
			while (a < b) {
				if (arr[a] + arr[b] == -arr[j]) {
					count++;
					break;
					// a++;
					// b--;
				} else if (arr[a] + arr[b] < -arr[j]) {
					a++;
				} else {
					b--;
				}

			}
		}
		 return count > 0 ? true:false;
       }
}
