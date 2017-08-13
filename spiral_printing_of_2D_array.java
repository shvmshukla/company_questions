package dynamic_programming;

public class spiral_printing_of_2D_array {
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      
       int k=0,l=0;
       int r=4,c=4;
       int i;
       
      while(k<r && l<c)
      {
          //first row
          for(i=k;i<c;i++)
          {
              System.out.print(a[k][i]+"  ");
          }
          k++;
          //last column
          for(i=k;i<r;i++)
          {
              System.out.print(a[i][c-1]+"  ");
          }
          c--;
          //last row
          for(i=c-1;i>=k;i--)
          {
              System.out.print(a[r-1][i]+"  ");
          }
          r--;
          
          //first column
          
          for(i=r;i>=k;i--)
          {
              System.out.print(a[i][l]+"  ");
          }
          l++;

                    
          
      }
            
    }
}
