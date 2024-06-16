package BitMagic.FindOddOcurringNumbs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class FindOddOccurringNumbs {
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter Array Length : ");
        int numb = sc.nextInt();

        //Taking Input 
        int[] intArr = new int[numb];
        System.out.println("Enter elements in Array : ");
        for(int i=0;i<intArr.length;i++)
        {
            System.out.print("Element "+(i+1)+" :");
            intArr[i] = sc.nextInt();
        }
        System.err.println("Input Array : "+Arrays.toString(intArr));

/*  
        //Approach-01
        System.out.print("Odd Occurring Numbers : ");
        Set<Integer> intSet = new LinkedHashSet<>();

        for(int i=0;i<intArr.length;i++)
        {
            int count=0; 
            if(intSet.add(intArr[i]))
            {
                for(int j=i;j<intArr.length;j++)
                {
                    if(intArr[i]==intArr[j])
                        count++;
                }     
            }

            if(count%2!=0)
            {
                System.out.print(intArr[i]+", ");
            }
        }
 */

        // Approach-02 
        // use only if single Oddly repeating number present
        
        int count=0;
        for(int i=0;i<intArr.length;i++)
        {
            count = count^intArr[i];
        }
        System.out.println("Op : "+count);







    }
}
