package NumberCodes.O02SumOfNaturalNumb;

import java.util.Scanner;

public class SumOfNaturalNumb {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numb : ");
        int numb = sc.nextInt();

        //Approach-01
        int sum = 0;
        for(int i=1;i<=numb;i++)
        {
            sum+=i;
        }

        System.out.println("Sum of "+numb+" Natural Number : "+sum);
    }
}
