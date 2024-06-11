package MathematicsProgrammes.PrimeNumbPrinter;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratorthenes {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

/* 
        // Approach-01
        for(int i=2;i<=numb;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+", ");
            }
        }
*/

/* 
        // Approch-02
        boolean[] arr = new boolean[numb+1] ;
        Arrays.fill(arr,true);

        for(int i=2;i*i<=numb;i++)
        {
            if(arr[i])
            {
                for(int j=2*i;j<=numb;j=j+i)
                {
                    arr[j]=false;
                }
            }  
        }

        for(int i=2;i<=numb;i++)
        {
            if(arr[i])
            {
                System.out.print(i+", ");
            }
        }
*/
/* 
        // Approach-03 Optimized02

        boolean[] arr = new boolean[numb+1] ;
        Arrays.fill(arr,true);

        for(int i=2;i*i<=numb;i++)
        {
            if(arr[i])
            {
                for(int j=i*i;j<=numb;j=j+i)
                {
                    arr[j]=false;
                }
            }  
        }

        for(int i=2;i<=numb;i++)
        {
            if(arr[i])
            {
                System.out.print(i+", ");
            }
        }
*/

        // Approach-04 Optimized-03
        boolean[] arr = new boolean[numb+1] ;
        Arrays.fill(arr,true);

        for(int i=2;i<=numb;i++)
        {
            if(arr[i])
            {
                System.out.print(i+", ");
                 
                for(int j=i*i;j<=numb;j=j+i)
                {
                    arr[j]=false;
                }
            }
        }


    }

    static boolean isPrime(int n)
    {
        boolean status =true;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                status=false;
            }
        }
        return status;
    }
}
