package NumberCodes.O07FindPrimeNumbWithinRange;

import java.util.Scanner;

public class PrimeNumbWithinRange {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Lower limit : ");
        int lowLim = sc.nextInt();
        System.out.print("Enter Upper limit : ");
        int upLim = sc.nextInt();

        //Approach-01
        System.out.println("Prime Numbers Between "+lowLim +" and "+upLim+" : ");
        for(int i=lowLim;i<=upLim;i++)
        {
            boolean isPrime = true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.print(i+", ");
            }
        }

    }
}
