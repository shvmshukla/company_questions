/*
Given two numbers as stings s1 and s2 your task is to multiply them. You are required to complete the function multiplyStrings which takes two strings s1 and s2 as its only argument and returns their product as strings.

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow . Each test case contains two strings s1 and s2 .

Output:
For each test case in a new line the output will be a string denoting the product of the two strings s1 and s2.

Constraints:
1<=T<=100
1<=length of s1 and s2 <=100

Example(To be used only for expected output) :
Input:
2
33 2
11 23
Output:
66
253
*/

/**
 *
 * @author shivam
 */
import java.util.Arrays;
public class Big_Number_Multiplication 

{
    public static void main(String[] args) {
        
    String A="99";
    String B="99";    
       char num1[]= A.toCharArray();  // 1 2 
       char num2[]= B.toCharArray();  // 1 2 6
    char result[]= new char[num1.length+num2.length+1];
    Arrays.fill(result,'0');
    
     int i_n1=0,i_n2=0;

     if(A.length()==0||B.length()==0)
            System.out.println("0");
       
     for(int i=num1.length-1;i>=0;i--)
     {
         int dig1=num1[i]-'0';
         i_n2=0; 
        int carry=0;
     for(int j=num2.length-1;j>=0;j--)
        {
            //multiply
            
           int dig2=num2[j]-'0';
           int temp=result[i_n1+i_n2]-'0';
           int sum= dig1*dig2+temp+carry;   
          // int sum= ((num1[i]-'0')*(num2[j]-'0'))+(result[i_n1+i_n2]-'0')+carry;    
           carry=sum/10;

          result[i_n1 + i_n2] = ((sum % 10)+"").charAt(0);
         
          i_n2++;
        }
     
        if (carry>0){ 
         result[i_n1+i_n2]= (((result[i_n1+i_n2]-'0')+carry)+"").charAt(0); 
        }
      i_n1++; 
     }
  
     //now collect result from result array
    int flag=0;
    String product="";

    for(int i=result.length-1;i>=0;i--)
    {
        if(flag==0 && (result[i]-'0')==0)
         continue;
        else
        {
            flag=1;
            product+=(result[i]-'0');
        }
    }
        System.out.println(product);
    }
}


