package MathematicsProgrammes.PrimeNumber;

import java.util.Scanner;

public class CheckIfPrimeNumber {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

/* 
        //Approach-o1
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
*/

/* 
        //Approach-02
        boolean isPrime =true;
        if(numb<2)
        {
            isPrime=false;
            System.out.println("Prime Starts from 2");
        }
        else
        {
            for(int i=2;i*i<=numb;i++)
            {
                if(numb%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime)
        {
            System.out.println(numb +" : Prime");
        }
        else
        {
            System.out.println(numb +" : Not Prime");
        }
 */


        //Approach-03
        boolean isPrime =true;
        if(numb<2)
        {
            isPrime=false;
            System.out.println("Prime Starts from 2!!");
        }
        else if(numb==2 || numb==3)
        {
            isPrime=true;
        }
        else if(numb%2==0 || numb%3==0)
        {
            isPrime=false;
        }
        else
        {
            for(int i=5;i*i<=numb;i=i+6)
            {
                if(numb%i==0 || numb%(i+2)==0)
                {
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime)
        {
            System.out.println(numb +" : Prime");
        }
        else
        {
            System.out.println(numb +" : Not Prime");
        }
        
    }
}
