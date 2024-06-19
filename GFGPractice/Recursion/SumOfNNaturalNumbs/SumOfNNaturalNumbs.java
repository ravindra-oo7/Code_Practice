package Recursion.SumOfNNaturalNumbs;

import java.util.Scanner;

public class SumOfNNaturalNumbs {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

/* 
        // Approach-01
        int sum = 0;
        for(int i=1;i<=numb;i++)
        {
            sum = sum+i;
        }

        System.out.println("Sum : "+sum);
*/   

        // Approach-02
        System.out.println("Sum "+sumOfNatural(numb));

    }

    private static int sumOfNatural(int numb) 
    {
        if(numb==0)
        {
            return numb;
        }
        return numb+sumOfNatural(numb-1);
    }

    
}
