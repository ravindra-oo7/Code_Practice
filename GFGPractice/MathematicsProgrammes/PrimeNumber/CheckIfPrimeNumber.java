package MathematicsProgrammes.PrimeNumber;

import java.util.Scanner;

public class CheckIfPrimeNumber {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

        if (numb<2) 
        {
            System.out.println(numb+" : Not Prime \nPrime starts from 2 !!");
        } 
        else if (numb==2) 
        {
            System.out.print(numb+ " : Prime Number");
        }
        else
        {        
            boolean isPrime = true;
            for(int i=2;i<=(int)Math.ceil(Math.sqrt(numb));i++)
            {
                if(numb%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println(numb+": Prime number");
            }
            else
            {
                System.out.println(numb + ": Not a Prime Number");
            }
        }    


    }
}
