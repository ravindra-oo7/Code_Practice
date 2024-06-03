package NumberCodes.O26CheckIfPerfectSquare;

import java.util.Scanner;

public class IsPerfectSquare {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int numb = Math.abs(sc.nextInt());

/*         
        //Approach-01
        double sqrt = Math.sqrt(numb);
        if(sqrt == (int)sqrt)
        {
            System.out.println(numb+" is Perfect square ");
        }
        else
        {
            System.out.println(numb+" is NOT Perfect square ");
        }
 */

        //Approach-02
        int sqrt = (int)Math.sqrt(numb);

        if(sqrt*sqrt == numb)
        {
            System.out.println(numb+" is Perfect square ");
        }
        else
        {
            System.out.println(numb+" is NOT Perfect square ");
        }
    }
}
