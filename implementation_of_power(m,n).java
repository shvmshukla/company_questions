import java.util.Scanner;
public class power_of_two_numbers {
    public long pow(int m,int n)
    {
        if(n==0)
            return 1;
        else if(n==1)
            return m;
        else if(n%2!=0)
            return m*pow(m,n/2)*pow(m,n/2);
        else
            return pow(m,n/2)*pow(m,n/2);
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m,n;
        m=sc.nextInt();n=sc.nextInt();
        power_of_two_numbers p= new power_of_two_numbers();
        System.out.println(p.pow(m,n));    
    }
    
}

/*
run:
5
5
3125
BUILD SUCCESSFUL (total time: 2 seconds)

run:
2
10
1024
BUILD SUCCESSFUL (total time: 1 second)
*/
