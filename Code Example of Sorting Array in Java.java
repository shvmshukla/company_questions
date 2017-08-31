import java.util.Arrays;
import java.util.Collections;

public class HashtableDemo {

public static void main(String args[]) {
String[] companies = { "Google", "Apple", "Sony" };

// sorting java array in ascending order
System.out.println("Sorting String Array in Ascending order in Java Example");
System.out.println("Unsorted String Array in Java: ");
printNumbers(companies);
Arrays.sort(companies);
System.out.println("Sorted String Array in ascending order : ");
printNumbers(companies);

// sorting java array in descending order
System.out.println("Sorting Array in Descending order in Java Example");
System.out.println("Unsorted int Array in Java: ");
printNumbers(companies);
Arrays.sort(companies, Collections.reverseOrder());
System.out.println("Sorted int Array in descending order : ");
printNumbers(companies);

System.out.println("Sorting part of array in java:");
int[] numbers = { 1, 3, 2, 5, 4 };
Arrays.sort(numbers, 0, 3);
System.out.println("Sorted sub array in Java: ");
for (int num : numbers) {
System.out.println(num);
}

}

public static void printNumbers(String[] companies) {
for (String company : companies) {
System.out.println(company);
}
}

}
/*
Output:
Sorting String Array in Ascending order in Java Example
Unsorted String Array in Java:
Google
Apple
Sony

Sorted String Array in ascending order :
Apple
Google
Sony

Sorting Array in Descending order in Java Example
Unsorted int Array in Java:
Apple
Google
Sony
Sorted String Array in descending order :
Sony
Google
Apple
Sorting part of array in java:
Sorted sub array in Java:
1
2
3
5
4



Read more: http://javarevisited.blogspot.com/2012/01/sort-array-in-java-ascending-and.html#ixzz4rJ2A2HWy*/
