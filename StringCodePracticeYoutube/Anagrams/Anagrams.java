package Anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String1: ");
        String str1 = sc.next(); // Read first string (single word)

        System.out.print("Enter String2: ");
        String str2 = sc.next(); // Read second string (single word)

        // Convert the strings to character arrays
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        // Convert sorted character arrays back to strings
        String sortedStr1 = new String(str1Arr);
        String sortedStr2 = new String(str2Arr);

        // Print the sorted arrays for verification
        System.out.println("Array 1 = " + sortedStr1);
        System.out.println("Array 2 = " + sortedStr2);

        // Check if the sorted strings are equal
        if (sortedStr1.equalsIgnoreCase(sortedStr2)) {
            System.out.println("Is Anagram");
        } else {
            System.out.println("Not Anagram!!!");
        }

        sc.close(); // Close the scanner
    }
}
