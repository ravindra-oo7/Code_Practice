package BitMagic.IsPowerOfTwo;

import java.util.Scanner;

public class IsPowerOfTwo {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

/*         
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
*/

        //Approch-
        // boolean flag =true;
        int comparer=1;
        while(comparer<numb)
        {
            comparer = comparer<<1;
            if(comparer == numb )
            {
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");






    }
}
