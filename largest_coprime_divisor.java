You are given two positive numbers A and B. You need to find the maximum valued integer X such that:

X divides A i.e. A % X = 0
X and B are co-prime i.e. gcd(X, B) = 1
For example,

A = 30
B = 12
We return
X = 5

//Efficient function (from interview bit)
int gcd(int A, int B)
{
    if (B == 0) return A;
    
    else gcd(B, A % B);
}

int cpFact(int A, int B) {
    
    int res;
    
    while (gcd(A, B) != 1)
    {
        A = A / gcd(A, B);
    }
    
    return A;
}

//my submission (failed in efficiency)
public class Solution {
    public int cpFact(int A, int B) {
        int gcd=1,res=1;
        for(int i=A;i>=1;i--)
                {
                    if(A%i==0)
                    {
                        //gcd of i and b is 1 or not
                        for(int j=1;j<=i && j<=B;j++ )
                        {
                            if(i%j==0 && B%j==0)
                            {
                                 gcd=j;
                            }
                            
                        }
                    }
                  if(gcd==1 && i>=res)
                  {
                      res=i;
                      break;
                  }
    }
    return res;
}
}
