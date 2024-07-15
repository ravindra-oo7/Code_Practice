package Anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagramSentence {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String1: ");
        String str1 = sc.nextLine(); // Read first string (Sentence)

        System.out.print("Enter String2: ");
        String str2 = sc.nextLine(); // Read second string (Sentence)  
        
        StringBuilder strBD1 = new StringBuilder(str1.replace("\\s+", ""));
        StringBuilder strBD2 = new StringBuilder(str2.replace("\\s+", ""));

        System.out.println(strBD1);
        System.out.println(strBD2);

        
        char[] str1Arr = strBD1.toString().toCharArray();
        char[] str2Arr = strBD2.toString().toCharArray();

        for(int i=0;i<str1Arr.length;i++)
        {
            str1Arr[i]=Character.toLowerCase(str1Arr[i]);
        }
        for(int i=0;i<str2Arr.length;i++)
        {
            str2Arr[i]=Character.toLowerCase(str2Arr[i]);
        }

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        System.out.println(str1Arr);
        System.out.println(str2Arr);

        if(Arrays.equals(str1Arr,str2Arr))
        {
            System.out.println("It is Anagram");
        }
        else
        {
            System.out.println("Not an Anagram!!!");
        }

    }
}
