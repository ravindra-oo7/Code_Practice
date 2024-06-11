package MathematicsProgrammes.FindAllFactors;

import java.util.Scanner;

public class FindAllFactors {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

/* 
        // Approach-01
        System.out.print("All Factors : ");
        for(int i=1;i<=numb;i++)
        {
            if(numb%i==0)
            {
                System.out.print(i+", ");
            }
        }

*/        
        
/* 
        // Approach-02 Optimised
        System.out.print("All Factors : ");
        for(int i=1;i*i<=numb;i++)
        {
            if(numb%i==0)
            {
                System.out.print(i+", ");
                if(i != numb/i)
                {
                    System.out.print(numb/i+", ");
                }
            }
        }
*/

        //Approach-03 same as above but output is Sorted
        System.out.print("All Factors : ");
        int i;
        for(i=1;i*i<numb;i++)
        {
            if(numb%i==0)
            {
                System.out.print(i+", ");
            }
        }
        for(;i>=1;i--)
        {
            if(numb%i==0)
            {
                System.out.print(numb/i+", ");
            }
        }

        
    }
}
