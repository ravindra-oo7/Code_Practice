package Recursion.PrintNNumbs;

import java.util.Scanner;

public class PrintNumbersNto1 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numb : ");
        int numb = sc.nextInt();
        
        //Approach-01
        for(int i=numb;i>0;i--)
        {
            System.out.print(" "+i);
        }

    }
    
}
