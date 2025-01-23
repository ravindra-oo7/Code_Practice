package NumberCodes.O05ArmstrongNumberCheck;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();
        String str = String.valueOf(numb);

        //Armstrong number is a number that is equal to the addition of (digit)^numOfDigits.
        //For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
        // 153 = 1+125+27
        
        
        //Approach-01
        int sum = 0;
        int length = str.length();
        for(int i=0;i<length;i++)
        {
            int temp = Character.getNumericValue(str.charAt(i));
            sum = (int)(sum+(Math.pow(temp, length)));
        }
        System.out.println("numb = "+numb+" | sum = "+sum);
        if(sum==numb)
        {
            System.out.println(numb+" is Armstrong Number. ");
        }
        else
        {
            System.out.println(numb+" is not Armstrong number !!");
        }
      

/* 
        //Approach-02
        int orignalNumb = numb;
        int sum = 0;
        int length = String.valueOf(numb).length();

        while(numb>0)
        {
            int digit = numb%10;
            sum += Math.pow(digit,length);
            numb /=10;
        }

        if(orignalNumb==sum)
        {
            System.out.println(orignalNumb+" is Armstrong Number.");
        }
        else
        {
            System.out.println(orignalNumb+" is Not Armstrong Number !!!");
        }
 */
        
    }
}
