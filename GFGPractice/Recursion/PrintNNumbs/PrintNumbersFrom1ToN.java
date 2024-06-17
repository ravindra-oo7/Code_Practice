package Recursion.PrintNNumbs;

import java.util.Scanner;

public class PrintNumbersFrom1ToN {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numb : ");
        int numb = sc.nextInt();

/*        
        //Approach-01
        for(int i=1;i<=numb;i++)
        {
            System.out.print(" "+i);
        }
*/

        // Approach-02 Recursive
        printNumb(numb);    
    }

    private static void printNumb(int numb) 
    {
        if(numb==0)
        {
            return;
        }
        printNumb(numb-1);
        System.out.print(" "+numb);
    }

}
