package dynamic_programming;

public class reverse_words_in_a_string {
    public static void main(String[] args) {
        String str="shivam.is.a.good.boy";
        int len= str.length();
        String result="";
        int follow =len;
        for(int i=len-1;i>=0;i--)
        {   
            if(str.charAt(i)=='.')
            {
                result=result+ str.substring(i+1,follow)+".";
                follow= i;
            }  
        }
       result+=str.substring(0,follow); 
        System.out.println(result);
    }
  
}
