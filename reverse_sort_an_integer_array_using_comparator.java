import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class reverse_sort {

public static void main(String args[]) {
Comparator<Integer> comparator = new Comparator<Integer>() {

        @Override
        public int compare(Integer o1, Integer o2) {
            //return o2.compareTo(o1);
            if(o2>o1)
                return 1;
            if(o2<o1)
                return -1;
            return 0;
        }
    };

    // option 1
    Integer[] array = new Integer[] { 1, 24, 4, 4, 345 };
    Arrays.sort(array, comparator);
   for(int element:array)
   {
       System.out.print(element+" ");
   }
 }
}
/*
output
345 24 4 4 1 BUILD SUCCESSFUL (total time: 0 seconds)
*/
