package Arrays.FindSecondLargestElement;

import java.util.Arrays;
import java.util.Scanner;

public class FindSecondLargestElement {
    public static void main(String[] args) 
    {
        int[] intArr = {10,10,5,5,5,4,2};
        System.out.println("Array : "+Arrays.toString(intArr));


/* 
        // Approach-01
        int largest = 0;
        int secLargest = 0;
        int pointer=0;
        for(int i=0;i<intArr.length;i++)
        {  
            if(largest<=intArr[i])
            {
                int temp = largest; 
                largest = intArr[i];
                secLargest = temp;
            }      
        }
        System.out.println("Second Largest Element : "+secLargest);
        System.out.println("Second Largest Elements Index : "+ pointer);
*/

/* 
        // Approach-02
        Arrays.sort(intArr);
        System.out.println("Array After Sort : "+Arrays.toString(intArr));


        System.out.println("Second Largest Element : "+intArr[intArr.length-2]);
*/

        // Approach -03
        int secLrg = -1, lrg = 0;
        for(int i=1;i<intArr.length;i++)
        {
            if(intArr[i]>intArr[lrg])
            {
                secLrg = lrg;
                lrg=i;
            }
            else if(intArr[i]!=intArr[lrg])
            {
                if(secLrg == -1 || intArr[i]>intArr[secLrg])
                {
                    secLrg = i;
                }
            }
        } 

        if(secLrg==-1)
        {
            System.out.println("No Second Largest Element in Array");
        }
        else
        {
            System.out.println("Second Largest Element : " + intArr[secLrg]);
            System.out.println("Second Largest Element's Index : " + secLrg);
            
        }

    }
}
