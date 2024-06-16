package BitMagic.FindMissingNumber;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumb {
    public static void main(String[] args) 
    {
        //Arrays should be of n number that has
        //values in range[1...n+1]
        //Every number appears exactly once
        // and one number in between will be missing

        int[] intArr = new int[]{1,2,3,4,5,6,8,9};//Missing = 7
        System.err.println("Input Array : "+Arrays.toString(intArr));

/*         
        // Approach-01
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        int firstNumb = intArr[0];
        for(int i=0;i<intArr.length;i++)
        {
            if(intArr[i]==firstNumb)
            {
                firstNumb++;
            }
            else
            {
                System.out.println("Missing Numb : "+firstNumb);
                System.exit(0);
            }
        }
*/

        // Approach-02
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        int firstNumb = intArr[0];
        for(int i=0;i<intArr.length;i++)
        {
            if((intArr[i]^firstNumb)==0)
            {
                firstNumb++;
            }
            else
            {
                System.out.println("Missing Numb : "+firstNumb);
                System.exit(0);
            }
        }

    }
}
