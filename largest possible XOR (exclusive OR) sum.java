//For a given set of integers find its subset that has the largest possible XOR (exclusive OR) sum.

int maxXor(int[] A) {

		  int []DP = new int[1<<A.length];
		  int curend=1,currp=1,maxx=0;
		  DP[0]= 0;
		  for(int i=0; i< A.length; i++){
		    for(int j=0; j<curend; j++){
		      DP[currp]= DP[j]^A[i];
		      if(DP[currp]>maxx){
		        maxx=DP[currp];
		      }
		      currp++;
		    }
		    curend=curend*2;
		  }
  return maxx;
  
}

//o/p
Input:
A: [2, 3, 4]
Output:
7
Expected Output:
7
Console Output:
Empty
