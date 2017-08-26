
/*
Given 2 numbers (where 6 can also be written as 5, and 5 as 6), 
calculate the maximum and minimum possible sum 

Ex : 
456 485 
Min 455 + 485 
Max 466 + 486

NOTE: i am making program for max .. min can be obtained by changing a little bit 
*/

/**
 *
 * @author shivam
 */
public class adobe_6and_5_replacement_solution {
    public static void main(String[] args) {
       int a= 456;
       int b= 482;
      
     System.out.println("maximum sum is "+ (convert_max(a)+convert_max(b)));  
    }
   public static int convert_max(int x)
   {
     int c=10,temp=x,result=0;
     for(int i=0;i<2;i++)
     {
         c=c*10;                   //100
         
     }
      
while(c>0)
{     
   int modulo = temp%c;    //56
   int val=temp-modulo;  //400;
   
   if(val==5*c)
   {
     result+=6*c;                
   }
   else
       result+=val;
   // System.out.println(result);
 c=c/10;
 temp=modulo;
} 
      return result; 
   }
     
}
