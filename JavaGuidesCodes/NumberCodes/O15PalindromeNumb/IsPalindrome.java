package NumberCodes.O15PalindromeNumb;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter  Number : ");
        int numb = sc.nextInt();

        //Approch-01
        StringBuilder strBD = new StringBuilder();
        String strNumb = Integer.toString(numb);

        for(int i=strNumb.length()-1;i>=0;i--)
        {
            strBD.append(strNumb.charAt(i));
        }
        String reverseInt = strBD.toString();

        if(strNumb.equals(reverseInt))
        {
            System.out.println(numb+ " : Palindrome.");
        }
        else
        {
            System.out.println(numb+ " : Not Palindrome.");
        }

    }

}
