package MathematicsProgrammes.FactorialTrailingZeros;

import java.util.Scanner;
import java.math.BigInteger;

public class FactorialsTrailingZerosCounter {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

/* 
        //Approach-01
        //Calculate factorial using BigInteger
        BigInteger fact =  BigInteger.ONE;
        
        for(int i=2;i<=numb;i++)
        {
            fact = fact.multiply(new BigInteger(Integer.toString(i)));
        }
        System.out.println("Factorial of "+numb+" : "+fact);

        // Count trailing zeros
        int counter = 0;
        BigInteger ten = BigInteger.TEN;
        while (fact.mod(ten).equals(BigInteger.ZERO))
        {
                fact = fact.divide(ten);
                counter++;
        }

        System.out.println("Trailing Zeros : "+counter);
*/

        //Approach-02
        System.err.println("Trailing Zeros : "+countTrailingZeros(numb));


    }
    
    static int countTrailingZeros(int n)
    {
        int res = 0;
        for(int i=5;i<=n;i=i*5)
            res = res+(n/i);
        return res;
    }
}
