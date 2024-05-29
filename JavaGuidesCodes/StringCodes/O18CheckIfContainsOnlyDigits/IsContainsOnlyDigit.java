package StringCodes.O18CheckIfContainsOnlyDigits;

import java.util.Scanner;

public class IsContainsOnlyDigit {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();
        boolean isDigit = true;

        for(int i=0;i<str.length();i++)
        {
           if(!Character.isDigit(str.charAt(i)))
           {
                isDigit = false;
           }
        }

        if(isDigit)
        {
            System.out.println("String contains Only Digit Characters");
        }
        else
        {
            System.out.println("String contains Non Digit Character!!");
        }
    }
}
