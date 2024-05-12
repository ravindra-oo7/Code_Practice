import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String to check if Palindrome : ");
        String str=sc.nextLine();
        
        if(isPalindrome(str))
        {
            System.out.println(str +" is Palindrome!");
        }else
        {
            System.err.println(str + "is not Palindrome! ");
        }

    }

    private static boolean isPalindrome(String str) {
       //Step1: Convert the String to lowercase
       String cleanString = str.toLowerCase(); 

       //Step2: 


    }
    
}
