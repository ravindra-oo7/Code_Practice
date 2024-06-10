package MathematicsProgrammes.FindNumberOfDigitsInNumber;
import java.util.Scanner;


public class NumberOfDigitsCounter {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

/* 
        //Approach-01
        int count=0;
        while(numb!=0)
        {
            numb=numb/10;
            count++;
        }
        System.out.print("Number of Digits in Input Number :"+ count);
*/

/* 
        //Approach-02
        System.out.println("Number of Digits in "+numb+" :"+countDigit(numb));
*/

        //Approach-03
        System.out.println("Digits count : "+(int)(Math.floor(Math.log10(numb)+1)));

    }



    static int countDigit(int n)
    {
        if(n==0)
            return 0;
        
        return 1 +countDigit(n/10);
    }
}
