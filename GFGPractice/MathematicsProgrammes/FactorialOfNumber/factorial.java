package MathematicsProgrammes.FactorialOfNumber;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

/* 
        //Approach-01
        int fact=1;
        for(int i=2;i<=numb;i++)
        {
            fact = fact*i;
        }

        System.out.println("Factorial of "+numb+" : "+fact);
*/

        //Approach-02
        System.out.println("Factorial of "+numb+" : "+factFunct(numb));


    }

    static int factFunct(int num)
    {
        if(num==0)
        {
            return 1;
        }
        return num*factFunct(num-1);
    }
}
