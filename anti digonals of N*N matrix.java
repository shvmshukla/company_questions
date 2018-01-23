//program to print anti digonals 
Input: 	

1 2 3
4 5 6
7 8 9

Return the following :

[ 
  [1],
  [2, 4],
  [3, 5, 7],
  [6, 8],
  [9]
]


public class Solution {
	public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
	    
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    int dimension = a.size();
	    for (int i = 0; i < dimension*2-1; i++) {
	        result.add(getDiagonal(i, a));
	    }
	    return result;
	}
	
	public ArrayList<Integer> getDiagonal(int layer, ArrayList<ArrayList<Integer>> a) {
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    for (int i = 0; i <= layer; i++) {
	        int j = layer-i;
	        if (i < a.size() && j < a.size()) {
	             result.add(a.get(i).get(j));
	        }
	    }
	    return result;
	}
}
