package Recursion.SubsetsOfString;

import java.util.Scanner;

public class GenerateSubsetsOfString {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String with Distinct Characters : ");
        String str = sc.next();
        String curr = "";

        printSubset(str,curr,0);
    }

    private static void printSubset(String str, String curr, int i) 
    {
       if(i==str.length())
       {
        System.out.print(curr+"  ");
        return;
       }

       printSubset(str, curr, i+1);
       printSubset(str, curr.concat(Character.toString(str.charAt(i))), i+1);

    }
}
