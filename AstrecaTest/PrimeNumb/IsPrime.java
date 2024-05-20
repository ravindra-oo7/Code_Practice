package PrimeNumb;
import java.util.Scanner;

public class IsPrime 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Numb to check If Prime : ");
        int numb1 = sc.nextInt();
        boolean isPrime = true;
        if(numb1>1)	
        {
            for(int i=2; i<numb1;i++)
            {
                    if(numb1%i==0)
                    {
                        isPrime = false;
                    }
            }
        }    	
        else
        {
            System.out.println("Number is less than 1");
            System.exit(0);
        }	
        
        if(isPrime)	
        {	
            System.out.println("Number is Prime Number");
        }
        else
        {
            System.out.println("Entered number is Not Prime");
        }
    }
        


}

