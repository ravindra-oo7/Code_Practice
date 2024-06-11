package MathematicsProgrammes.FindAllFactors;

import java.util.Scanner;

public class FindAllFactors {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();


        // Approach-01
        System.out.print("All Factors : ");
        for(int i=1;i<=numb;i++)
        {
            if(numb%i==0)
            {
                System.out.print(i+", ");
            }
        }
    }
}
