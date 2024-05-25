package StringCodes.O05StringPermutations;

import java.util.Scanner;

public class StringPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Word : ");
        String word = sc.next();

        generatePermutations(word,"");
        System.out.println("All permutations of "+ word +" have been displayed.");
    }

    private static void generatePermutations(String str,String ans) 
    {
       if(str.length()==0)
       {
            System.out.println(ans);
            return;
       }
       for(int i=0;i<str.length();i++)
       {
            char ch = str.charAt(i);
            String remaining= str.substring(0, i) + str.substring(i+1);
            generatePermutations(remaining, ans+ch);
       }
    }
}
