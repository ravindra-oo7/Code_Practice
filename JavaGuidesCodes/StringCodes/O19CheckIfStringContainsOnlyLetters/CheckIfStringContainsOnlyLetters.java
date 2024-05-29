package StringCodes.O19CheckIfStringContainsOnlyLetters;

import java.util.Scanner;

public class CheckIfStringContainsOnlyLetters 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();

        for(int i=0;i<str.length();i++)
        {
            if(!Character.isLetter(str.charAt(i)))
            {
                System.out.println("String Contains other character than Letters");
                System.exit(0);
            }
        }
        System.err.println("String Contains Only letters");        
    }
}
