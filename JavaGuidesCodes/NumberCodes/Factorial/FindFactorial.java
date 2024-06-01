package NumberCodes.Factorial;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

/*        
        //Approch-01
        int factorial = 1;
        for(int i=1;i<=numb;i++)
        {
            factorial = i*factorial;
        }

        System.out.println("Factorial of "+ numb + " : "+ factorial);
*/

        //Approach-02 using recursion
        int fact = findFactorial(numb);
        System.out.println("Factorial of "+ numb + " : "+ fact);

    }

    private static int findFactorial(int numb) 
    {
        if(numb>1)
        {
            int factorial = numb *findFactorial(numb-1);
            return factorial;
        }
        return 1;
    }
}
