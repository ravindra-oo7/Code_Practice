package MathematicsProgrammes.FactorialOfNumber;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

        //Approach-01
        int fact=1;
        for(int i=1;i<=numb;i++)
        {
            fact = fact*i;
        }

        System.out.println("Factorial of "+numb+" : "+fact);



    }
}
