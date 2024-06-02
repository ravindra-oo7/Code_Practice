package NumberCodes.O06CountNumberOfDigits;

import java.util.Scanner;

public class CountNumbDigit {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();


        //Approach-01
        String str = String.valueOf(numb);
        System.out.println("Number of digits in entered number is "+ str.length());
        
    }
}
