package StringCodes.O20CheckIfStringContainsOnlyLettrsOrDigits;

import java.util.Scanner;

public class CheckIfStringContrainsOnlyLettersOrDigits {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();

        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);
            if(!Character.isLetterOrDigit(ch))
            {   
                System.out.println("String Contains Other Than Character or Digit !!!");
                System.exit(0);
            }
        }
        System.out.println("String Contains only Letters or Digits ");

    }
}
