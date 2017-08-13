
package dynamic_programming;

public class replace_letter_by_frequency {
    public static void main(String[] args) {
        String str="aabcccccaaa";
        String res="";
        char last=str.charAt(0);
        int i,count=1;
        
        for(i=1;i<str.length();i++)
        {
            if(str.charAt(i)==last)
                count++;
            else{
                res=res+last+count;
                last=str.charAt(i);
                System.out.println(last);
                count=1;
            }
                
        }
        res=res+last+count;
        System.out.println(res);
    }
}
