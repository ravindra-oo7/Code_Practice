package BitMagic.CheckIfKthBitIsSet;

import java.util.Scanner;

public class CheckIfKthBitIsSet {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();
        System.out.print("Enter position to check : ");
        int k = sc.nextInt();
 
/*         
        //Approach-01 Using left Shift 

        if((numb & (1<<(k-1)))!=0) // 1 ka binary form ko left shift kiya 
        {                          //and comapre kiya numb ke bin form ke sath
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
 */

        //Approach-02  Using Right Shift
        if((numb>>(k-1) & 1) == 1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }



    }
}
