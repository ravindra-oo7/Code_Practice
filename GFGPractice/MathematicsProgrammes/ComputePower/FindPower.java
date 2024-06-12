package MathematicsProgrammes.ComputePower;
import java.math.BigInteger;
import java.util.Scanner;

public class FindPower {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numb1 : ");
        int base = sc.nextInt();
        System.out.print("Enter Numb2 : ");
        int pow = sc.nextInt();

/* 
        // Approch-01
        int result =1;
        for(int i=0;i<pow;i++)
        {
            result = result * base;
        }
        System.out.println(base+" to the Power "+pow+" : "+result);
*/


        //Approch-02
        System.out.println(base+" to the Power "+pow+" : "+Math.pow(base, pow));

    }
}
