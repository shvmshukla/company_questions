Determine whether an integer is a palindrome. Do this without extra space.

/**
 *
 * @author shivam
 */
public class pallindrome {
    public static void main(String[] args) {
        int A=123;
        int rev=0,temp=A,len=0;
    while(temp>0)
    {
        temp/=10;
        len++;
    }
        System.out.println(len);
    //forming reverse
    int temp1=A;
    while(temp1>0)
    {
        int r= temp1%10;
        temp1/=10;
        rev+= r*Math.pow(10,len-1);
        len--;
    }
        System.out.println(rev);
    if(A==rev)
            System.out.println("is Pallindrome");
    else
            System.out.println("is not Pallindrome");
    }
}
