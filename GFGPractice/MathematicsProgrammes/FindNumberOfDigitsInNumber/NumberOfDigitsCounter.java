package MathematicsProgrammes.FindNumberOfDigitsInNumber;
import java.util.Scanner;


public class NumberOfDigitsCounter {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

        //Approach-01
        int count=0;
        while(numb!=0)
        {
            numb=numb/10;
            count++;
        }

        System.out.print("Number of Digits in Input Number :"+ count);


    }
}
