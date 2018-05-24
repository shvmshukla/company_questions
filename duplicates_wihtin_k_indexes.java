
/*
Write a function that determines whether a array contains duplicate characters within k indices of each other
*/
/**
 *
 * @author shivam
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class DuplicateWithin_k_indexes {
    public static void main(String[] args) {
Set<Integer> visited= new HashSet<Integer>();
int arr[]= {1,2,3,4,5,2,6};
//int arr[]={1,2,3,4,2,5,6};
Scanner sc= new Scanner(System.in);
System.out.println("Enter range within with duplicates need to be checked");
int k=sc.nextInt();
for(int i=0;i<arr.length;i++)
{
    //checking for duplicacy within k.. if found ..print and break
    if(visited.contains(arr[i]))
    {
        System.out.println("Yes !!!A duplicate found within k distance");
        break;
    }
    //if duplicate not found remove elements outside k distance
    if(i-k>=0)
    {
        visited.remove(arr[i-k]);
    }
    //then add the element
   visited.add(arr[i]); 
  
 }
System.out.println("No duplicates");  
    }
}

//OUTPUT
/*
run:
Enter range within with duplicates need to be checked
3
in this array there are no duplicates within k distance
BUILD SUCCESSFUL (total time: 0 seconds)

*/
