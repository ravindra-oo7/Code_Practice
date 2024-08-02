package Searching.FindReapetingElementInArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindRepeatingElementInArray 
{
    public static void main(String[] args) 
    {
        int[] arr = {0,2,1,3,2,2};   
        int len = arr.length;

/*         
        // Approach-01 Naive solution {Time = O(n^2) and Space = O(1)}
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
        System.out.println("No Repeating Element Found!!!");
*/

/* 
        // Approach-02 naive Solution {Time = O(nlogn) && Space = O(1)}
        Arrays.sort(arr);
        for(int i = 0;i<len-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("No Repeating Element Found!!!");
*/

        // Approach-03 Efficiant Solution { Time = O(n) && Space = O(n) }

        boolean[] arrBool = new boolean[len];

        for(int i=0;i<len;i++)
        {
            if(arrBool[arr[i]]==true)
            {
                System.out.println(arr[i]);
                return;
            }
            else
            {
                arrBool[arr[i]]=true;
            }
        }
        System.out.println("No Repeating Element Found!!!");

    }    
}
