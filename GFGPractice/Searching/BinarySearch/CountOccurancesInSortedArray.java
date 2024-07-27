package Searching.BinarySearch;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurancesInSortedArray 
{
    public static void main(String[] args) 
    {
        int[] arr = {10,20,20,20,40,40};
        int len = arr.length;
        
        //int k = 10; // ans = 1
        //int k = 20; // ans = 3
        //int k = 40; // ans = 2
        int k = 50; // 0 

        // Approach-01
        int counter = 0;
        for(int i=0;i<len;i++)
        {
            if(arr[i]==k)
            {
                counter++;
            }
        }
        System.out.println(counter);

    }    
}
