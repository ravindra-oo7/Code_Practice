package Searching.BinarySearch;

import java.util.Scanner;

public class FindSquareRoot {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

        // Approach-01
        System.out.println((int)Math.sqrt(numb));

    }
}
