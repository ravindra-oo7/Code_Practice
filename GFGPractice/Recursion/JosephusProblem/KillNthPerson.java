package Recursion.JosephusProblem;

import java.util.Scanner;

public class KillNthPerson {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Person in Circle : ");
        int person = sc.nextInt();
        System.out.print("Enter Person To Kill : ");
        int k = sc.nextInt();

/* 
    // Approach-01
        boolean[] perArr = new boolean[person];

        //Setting All as Live ie. true=live
        for (boolean b : perArr) 
        {
            b=true;
        }
 */

        // Approach-02
        System.out.println("Last Man Standing : "+jos(person,k));


    }

    private static int jos(int person, int k) 
    {
        if(person==1)
        {
            return 0;
        }
        else
            return (jos(person-1,k)+k) % person;

    }
}
