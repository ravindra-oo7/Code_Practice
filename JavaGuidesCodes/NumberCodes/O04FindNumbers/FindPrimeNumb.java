package NumberCodes.O04FindNumbers;

import java.util.Scanner;

public class FindPrimeNumb {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Upper Limit : ");
        int upperLimit = sc.nextInt();
        System.out.print("Prime Numbers upto "+upperLimit+" : 2");
        
        for(int i=3;i<=upperLimit;i++)
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
                System.out.print(" ,"+i);
            }
        }


    }
}
