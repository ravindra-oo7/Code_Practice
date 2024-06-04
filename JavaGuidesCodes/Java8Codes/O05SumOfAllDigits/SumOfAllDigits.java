package Java8Codes.O05SumOfAllDigits;

import java.util.Scanner;

public class SumOfAllDigits {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        Integer numb = sc.nextInt();

/*         
        //Approach-01
        int sum = 0;
        while (numb!=0) 
        {
            int temp = numb%10;
            sum+=temp;
            numb /=10;
        } 
        System.out.println("Sum of All Digits : "+sum);
*/
        //Appraoch-02
        String numbStr = Integer.toString(numb);
        int sum = numbStr.chars()
                        .map(Character::getNumericValue)
                        .sum();

        System.out.println("Sum of All Digits : "+sum);


    }
}
