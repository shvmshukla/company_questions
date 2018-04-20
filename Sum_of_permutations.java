/*
Given N distinct digits in an array A (from 1 to 9), 
Your task is to complete the function getSum which finds sum of all n digit numbers that can be formed using these digits. 

For first test case
the numbers formed will be 123 , 132 , 312 , 213, 231 , 321
sum = 123 + 132 + 312 + 213 + 231 + 321 = 1332

For second test case
the numbers formed will be 12, 21
sum = 12 + 21 = 33
*/


class GfG{
         //static int res;

    public long getSum(int A[],int n){
         //add code here.
         Scanner sc= new Scanner(System.in);
         
         long sum=0;
       
        
          StringBuffer s= new StringBuffer("");
            for(int i=0;i<n;i++)
            {
                s.append(A[i]);
            }
        String str= s.toString();
        //now permute the string and while printing ,dont print rather take sum
         
        return permute(str,0,n-1);
    }
    
 public int permute(String str1,int l,int r)
  {
      int res=0;
        if(l==r)
        {
            return (Integer.valueOf(str1));
        }
        else
        {
          for (int i = l; i <= r; i++)
           {
            str1= swap(str1,l, i);
            res=(res+permute(str1, l+1, r))%1000000007;
            str1= swap(str1,l,i); //backtrack
            }
       }
      // System.out.println(res);
       return res;
  }
  
 public String swap(String a, int i, int j)
    {
        
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    } 
    
}
