package NumberCodes.O12FindGCD;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter First Number : ");
        int numb1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int numb2 = sc.nextInt();

        //Approach-01
        int min = Math.min(numb1, numb2);
        int highestDivisor=0;
        for(int i=1;i<min;i++)
        {
            if(numb1%i==0 && numb2%i==0)
            {
                highestDivisor =i;
            }
        }
        System.out.println("The Highest Common Divisor of " + numb1 + " and " + numb2 + " is: " + highestDivisor);

        
    }
}
