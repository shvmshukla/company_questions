package dynamic_programming;

public class remove_duplicates_in_a_string {
 
    public static String removeDuplicates(String s)
    {
        int i,j;
        String res="";
        for(i=0;i<s.length();i++)
        {
            String temp= s.charAt(i)+"";
           // System.out.println(temp);
            if(!(res.contains(temp)))
              res+=temp;
            else
                continue;
        }
        
    return res;
    }
    
    
    public static void main(String[] args) {
        String str="geeksforgeeks";
        System.out.println(removeDuplicates(str));
        
        String str1="geeks for geeks";
        System.out.println(removeDuplicates(str1));
    }
}
