package StringCodes.O18CheckIfContainsOnlyDigits;

import java.util.Scanner;

public class CheckIfDigit {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();

        if(str.matches("\\d+"))
        {
            System.out.println("The String contains only digits.");
        }
        else
        {
            System.out.println("String contains character other than Digits!!!");
        }
        
    }
}
