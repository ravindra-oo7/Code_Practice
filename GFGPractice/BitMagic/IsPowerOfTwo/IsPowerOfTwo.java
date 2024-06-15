package BitMagic.IsPowerOfTwo;

import java.util.Scanner;

public class IsPowerOfTwo {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

        //Approach-01
        int counter = 2;
        while (counter<numb) 
        {
            counter=counter*2;
        } 
        if(counter==numb)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}
