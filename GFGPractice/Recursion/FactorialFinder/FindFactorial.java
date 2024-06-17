package Recursion.FactorialFinder;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numb : ");
        int numb = sc.nextInt();

        // Approach-01
        int fact = 1;
        for(int i=1;i<=numb;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial : "+fact);

    }
}
