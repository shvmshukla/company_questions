package dynamic_programming;

/*
res[0]=  1
         2
         6
         4 2
         
*/

public class large_factorial {
    public static void main(String[] args) {
        
    
  int res[]= new int[500];
  int n=100,i=0,size=1,carry=0,j;
  res[0]=1;  
  for(i=2;i<=n;i++)
  {
     for(j=0;j<size;j++)
     {
         int p= res[j]*i+carry;    
          res[j]= p%10;             
          carry=p/10;              
          
     }
     
  
      while(carry > 0)
      {
          res[size]=carry%10;
          carry/=10;
          size++;
          
      }        
   
 }
        for(i=size-1;i>=0;i--)
        {
            System.out.print(res[i]);
        }
}
}    
