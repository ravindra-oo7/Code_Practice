package ArrayCodes.O06SortArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int arrSize = sc.nextInt();

        int[] arrInt = new int[arrSize];
        
        for (int i=0;i<arrInt.length;i++) 
        {
            System.out.print("Enter element "+(i+1)+" : "); 
            arrInt[i] = sc.nextInt();  
        }
        System.out.println("Unsorted Array : "+Arrays.toString(arrInt));
 
/*         
    //Approach-01 Accending Sorting
        Arrays.sort(arrInt);
        System.out.println("Sorted Array : "+Arrays.toString(arrInt));
*/

/* 
    //Approach-02 Decending Sorting
        Integer[] arrInteger = new Integer[arrInt.length];

        for (int i=0;i<arrInt.length;i++) 
        {
            arrInteger[i] = arrInt[i];
        }

        Arrays.sort(arrInteger,Collections.reverseOrder());    
        System.out.println("Sorted Array : "+Arrays.toString(arrInteger));
*/

    //Approach-03
        for(int i=0;i<arrInt.length;i++)
        {
            //Assume first element is the largest
            int largestNumIndex = i;

            //Iterate and get largest elements index
            for(int j=i+1;j<arrInt.length;j++)
            {
                if(arrInt[j]>arrInt[largestNumIndex])
                {
                    largestNumIndex = j;
                }
            }

            //swap the largest element with 1st element of the unsorted part
            int largerNumb          =   arrInt[largestNumIndex];
            arrInt[largestNumIndex] =   arrInt[i];
            arrInt[i]               =   largerNumb;
        }

        System.out.println("Sorted Array : "+Arrays.toString(arrInt));



    }
}
