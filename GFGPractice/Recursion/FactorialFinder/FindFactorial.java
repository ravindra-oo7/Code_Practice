package Recursion.FactorialFinder;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numb : ");
        int numb = sc.nextInt();

/*         
        // Approach-01
        int fact = 1;
        for(int i=1;i<=numb;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial : "+fact);
*/

/* 
        // Approach-02
        System.out.println("Factorial : "+factFind(numb));
*/
        // Approach-03
        System.out.println("Factorial : "+factFindTailRecursive(numb,1));

    }

    private static int factFindTailRecursive(int numb, int k) 
    {
        if(numb==0||numb==1)
        {
            return k;
        }
        return factFindTailRecursive(numb-1,k*numb);
    }

    private static int factFind(int numb) 
    {
       int fact=numb;
       if(numb==0||numb==1)
       {
         return 1;
       }
        return fact*factFind(numb-1);
    }
}
