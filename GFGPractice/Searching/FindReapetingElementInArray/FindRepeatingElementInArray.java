package Searching.FindReapetingElementInArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindRepeatingElementInArray 
{
    public static void main(String[] args) 
    {
        //int[] arr = {0,2,1,3,2,2}; // ans = 2
        //int[] arr = {1,3,2,4,3,3}; // ans = 3
        int[] arr = {3,4,5,1,2,4,4}; // ans = 4 
        //int[] arr = {1,1}; // ans = 1
        //int[] arr = {0,0}; // ans = 0
        //int[] arr = {1}; // ans = 1

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

/* 
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
*/

        // Approach-04 Efficiant Solution { Time = O(n) && Space = O(1) }
        // Does not works for array with less than 2 elements
        int slow = arr[0]+1;
        int fast = arr[0]+1;

        do 
        {
            slow = arr[slow]+1;
            fast = arr[arr[fast]+1]+1;
        } 
        while(slow != fast);

        slow = arr[0]+1;
        while (slow != fast) 
        {
            fast = arr[fast]+1;
            slow = arr[slow]+1;    
        }

        System.out.println(slow-1);

    }    
}
