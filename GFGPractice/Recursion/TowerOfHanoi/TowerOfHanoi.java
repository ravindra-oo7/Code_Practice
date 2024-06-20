package Recursion.TowerOfHanoi;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of discs : ");
        int n = sc.nextInt();

        towOfHanoi(n,'A','B','C');
    }

    private static void towOfHanoi(int n, char A, char B, char C) 
    {
        if(n==1)
        {
            System.out.println("Move 1 from "+A+" to "+C);
            return;
        }

        towOfHanoi(n-1, A, C, B);
        System.out.println("Move "+n+" from "+A+" to "+C);
        towOfHanoi(n-1, B, A, C);

    }
}
