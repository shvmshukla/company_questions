

package dynamic_programming;

/**
*
 * @author shivam
 */
public class minimum_coin_changing {

    public static int coinChange(int total,int coins[])
    {
      int T[]=new int[total+1]; 
      int R[]=new int[total+1]; 
      int i,j;
      T[0]=0;
      
      for(i=1;i<=total;i++)
      {
          T[i]=Integer.MAX_VALUE-1;
      }
      
      for(i=1;i<=total;i++)
      {
          R[i]=0;
      }
      
      
     for(j=0;j<coins.length;j++)
      {
          for(i=1;i<=total;i++)
          {
              if(i>=coins[j])
              {
                  if (T[i - coins[j]] + 1 < T[i])
                  {
                      T[i]= 1+ T[i-coins[j]];
                      R[i]=j;
                  }
              }
                  
          }
      }
     printCoinCombination(R,coins);
      return T[total];
    }
    
    public static void printCoinCombination(int R[],int coins[])
    {
        if(R[R.length-1]==-1)
            System.out.println("NO solution possible");
        int start= R.length-1;
        System.out.println("Coins to be picked are:");
           while(start!=0)
           {
               int j= R[start];
               System.out.print(coins[j]+"  ");
               start= start-coins[j];
           }
         System.out.println("");  
    }
    
    public static void main(String[] args) {
        int coins[]= {7,2,3,6};
        int total=13;
        
        System.out.println("minimum number of coins to be picked for this total is "+coinChange(total,coins));
    }
}
