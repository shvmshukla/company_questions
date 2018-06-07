/*
https://www.geeksforgeeks.org/shortest-common-supersequence/
*/
public class shortest_common_supersequence {
    public static void main(String[] args) {
        String str1="GXTXAYB";
        String str2="AGGTAB";
       int dp[][]= new int[str1.length()+1][str2.length()+1];
       
      for(int i=0;i<=str1.length();i++)
      {
          for(int j=0;j<=str2.length();j++)
          {
              if(i==0)
                  dp[i][j]=j;
              else if(j==0)
                  dp[i][j]=i;
              else if(str1.charAt(i-1)==str2.charAt(j-1))
                  dp[i][j]=1+dp[i-1][j-1];
              else
                  dp[i][j]=1+Math.min(dp[i-1][j],dp[i][j-1]);
          }
      }
     //for printing dp[][] 
      for(int i=0;i<=str1.length();i++)
      {
          for(int j=0;j<=str2.length();j++)
          {
              System.out.print(dp[i][j]+"  ");
          }
          System.out.println("");
      }
        System.out.println("answer "+dp[str1.length()][str2.length()] );
    }
   
}
/*
run:
0  1  2  3  4  5  6  
1  2  2  3  4  5  6  
2  3  3  4  5  6  7  
3  4  4  5  5  6  7  
4  5  5  6  6  7  8  
5  5  6  7  7  7  8  
6  6  7  8  8  8  9  
7  7  8  9  9  9  9  
answer 9
BUILD SUCCESSFUL (total time: 0 seconds)
*/
