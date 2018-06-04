/*
Given an integer x, find square root of it. If x is not a perfect square, then return floor(√x).
*/
//time complexity O(n^2)
/**
 *
 * @author shivam
 */
import java.util.Scanner;

public class square_root_of_a_number {

    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
       
        
        System.out.println("Enter a number whose square root(or floor of sqrt(x)) you want ");
            int x = sc.nextInt();

            if (x == 0 || x == 1) {
                System.out.println(x);
                return;

            }
            int low = 0, high = x;

            while (low <= high) {
                int mid = (low + (high - low) / 2);

                if (mid * mid == x) {
                    System.out.println("Answer="+mid);
                    break;
                } 
                else if (mid * mid < x && (mid+1) * (mid + 1) > x) {
                    System.out.println("Answer="+mid);
                    break;
                }
                else if (mid * mid < x && (mid + 1) * (mid + 1) <= x) {

                    low = mid + 1;
                   //System.out.println("low2 " + low);
                }
                else {
                    if((high)*(high)==x )
                    {
                        System.out.println("Answer="+(high));
                        break;
                    }
                    
                    high = mid - 1;
                    //System.out.println("high1 " + high);
                    
                    if((high)*(high)<=x )
                    {
                        System.out.println("Answer="+(high));
                        break;
                    }
                    if((high-1)*(high-1)<x )
                    {
                        System.out.println("Answer="+(high-1));
                        break;
                    }
                    
                }
            }
        }
    
}


 /*
 OUTPUT
 run:
Enter a number whose square root(or floor of sqrt(x)) you want 
529
Answer=23
BUILD SUCCESSFUL (total time: 2 seconds)

run:
Enter a number whose square root(or floor of sqrt(x)) you want 
36
Answer=6
BUILD SUCCESSFUL (total time: 1 second)

  */
