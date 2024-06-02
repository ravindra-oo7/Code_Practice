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
/* 
        //Approach-01
        int min = Math.min(numb1, numb2);
        int highestDivisor=0;
        for(int i=1;i<min;i++)
        {
            if(numb1%i==0 && numb2%i==0)
            {
                highestDivisor =i;s
            }
        }
        System.out.println("The Highest Common Divisor of " + numb1 + " and " + numb2 + " is: " + highestDivisor);
*/

        //Approch-02
        while(numb2!=0)
        {
            int temp = numb2;
            numb2 = numb1%numb2;
            numb1=temp;
        }
        System.out.println("HCF : " + numb1);
    }
}
