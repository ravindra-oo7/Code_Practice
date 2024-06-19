package Recursion.PrintFibonaci;

import java.util.Scanner;

public class PrintFibonacci {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();
        
/*         
        //Approch-01
        int firstNumb = 0;
        int secondNumb = 1;
        while(firstNumb<=numb)
        {
            System.out.print(firstNumb+" ");
            secondNumb = firstNumb+secondNumb;
            firstNumb = secondNumb-firstNumb;
        }
*/

        // Approach-02 recursive Approach
        int firstNumb = 0;
        int secondNumb = 1;

        printFibo(firstNumb,secondNumb,numb);
    }

    private static void printFibo(int firstNumb, int secondNumb, int numb) 
    {
        if(firstNumb>numb)
        {
            return;
        }

        System.out.print(firstNumb+" ");
        secondNumb = secondNumb+firstNumb;
        firstNumb = secondNumb-firstNumb;

        printFibo(firstNumb, secondNumb, numb);
         
    }

}
