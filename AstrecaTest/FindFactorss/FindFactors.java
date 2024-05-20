package FindFactorss;
import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number to find its Factors : ");
        int numb1 = sc.nextInt();

        System.out.print("Factors of "+numb1+" are : ");
        printFactors(numb1);
    }

    public static void printFactors(int numb)
    {
        for(int i=1;i<=numb/2;i++)
        {
            if(numb%i ==0)
            {
                System.out.print(i+"  ");
            }
        }
    }
}
