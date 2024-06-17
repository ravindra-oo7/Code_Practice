package Recursion.PrintFibonaci;

import java.util.Scanner;

public class PrintFibonacci {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();
        
        
        //Approch-01
        int firstNumb = 0;
        int secondNumb = 1;
        while(firstNumb<=numb)
        {
            System.out.print(firstNumb+" ");
            secondNumb = firstNumb+secondNumb;
            firstNumb = secondNumb-firstNumb;
        }
    }
}
