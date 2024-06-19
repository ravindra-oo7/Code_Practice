package Recursion.SumOfDigits;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();


        //Approach-01
        int sum = 0;
        while(numb>0)
        {
            int lastDigit = numb%10;
            sum += lastDigit;
            numb/=10;
        }
        System.out.println("Sum : "+sum);
    }
}
