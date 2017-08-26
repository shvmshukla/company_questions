import java.util.*;

/**
 *
 * @author avnegers
 */
public class BigSorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Comparator<String> c=new Comparator<String>() {
            @Override
            public int compare(String t1, String t2) {
                if(t1.length()>t2.length())
                    return 1;
                else if(t2.length()>t1.length())
                    return -1;
                for (int i = 0; i <t1.length(); i++) {
                    if(t1.charAt(i)>t2.charAt(i))
                        return 1;
                    else if(t2.charAt(i)>t1.charAt(i))
                        return -1;
                }
                return 0;
            }
        };
        String arr[]=new String[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.next();
        }
        Arrays.sort(arr,c);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); 
        }
    }
}
