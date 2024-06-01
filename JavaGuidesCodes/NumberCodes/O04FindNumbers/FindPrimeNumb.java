package NumberCodes.O04FindNumbers;

import java.util.Scanner;

public class FindPrimeNumb {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Upper Limit : ");
        int upperLimit = sc.nextInt();
        System.out.print("Prime Numbers upto "+upperLimit+" : 2, 3");

/*         
        //Approach-01
        for(int i=4;i<=upperLimit;i++)
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
 */

/* 
        //Optimized way
        for(int i=4;i<=upperLimit;i++)
        {
            boolean isPrime = true;
            for(int j=2;j<=i/2;j++)
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
*/
         // Most Optimized way
         for(int i=4;i<=upperLimit;i++)
         {
             boolean isPrime = true;
             for(int j=2;j<=Math.sqrt(i);j++)
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
