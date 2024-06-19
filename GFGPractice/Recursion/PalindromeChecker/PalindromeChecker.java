package Recursion.PalindromeChecker;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();


        // Approach-01
        StringBuilder strBD = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            strBD.append(ch);
        }

        if(str.equals(strBD.toString()))
        {
            System.err.println("Palindrome!!");
        }
        else
        {
            System.out.println("Not Palindrome");
        }        

    }
}
