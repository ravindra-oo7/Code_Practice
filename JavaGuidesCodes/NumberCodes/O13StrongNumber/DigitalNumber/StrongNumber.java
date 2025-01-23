package NumberCodes.O13StrongNumber.DigitalNumber;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Number : ");
        int numbInput = sc.nextInt();

        //The sum of Factorial of each digit of the number must be equal to the number itself. 
        // eg. 145 = 1!+4!+5! = 1+24+120 = 145
        int numb = numbInput;
        int sum = 0;
        while(numb!=0)
        {
            int temp = numb%10;
            numb=numb/10;
            int fact=1;
            for(int i=1;i<=temp;i++)
            {
                fact = fact*i;
            }
            sum=sum+fact;
        }

        System.out.println("Sum is :"+sum);
        if(sum==numbInput)
        {
            System.out.println(numbInput+ " is Strong Number.");
        }
        else
        {
            System.out.println(numbInput+" Is Not Strong Number !!!");
        }
    }
}
