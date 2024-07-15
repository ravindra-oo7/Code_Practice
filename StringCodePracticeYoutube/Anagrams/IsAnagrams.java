package Anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String1: ");
        String str1 = sc.next(); // Read first string (single word)

        System.out.print("Enter String2: ");
        String str2 = sc.next(); // Read second string (single word)

        // Convert the strings to character arrays
        char[] str1Arr = new char[str1.length()];
        char[] str2Arr = new char[str2.length()];

        for(int i=0;i<str1.length();i++)
        {
            str1Arr[i] = Character.toLowerCase(str1.charAt(i));
        }
        for(int i=0;i<str2.length();i++)
        {
            str2Arr[i] = Character.toLowerCase(str2.charAt(i));
        }

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
