package Recursion.SubsetSumProblem.PrintAllPatternsOfString;

import java.util.Scanner;

public class PrintAllPermutationsOfString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();

        permute(str,0);
        
    }

    public static void permute(String s,int i)
    {
        if(i==s.length()-1)
        {
            System.out.print(s+" ");
            return ;
        }

        for(int j=i;j<s.length();j++)
        {
            swap(s.charAt(i),s.charAt(j));
            permute(s, i+1);
            swap(s.charAt(i),s.charAt(j));
        }

    }

    private static void swap(char ch1, char ch2) 
    {
       
    }
}
