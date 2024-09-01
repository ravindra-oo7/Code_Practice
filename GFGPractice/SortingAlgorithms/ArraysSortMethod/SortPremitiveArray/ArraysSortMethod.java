package SortingAlgorithms.ArraysSortMethod.SortPremitiveArray;

import java.util.Arrays;

public class ArraysSortMethod 
{
    public static void main(String[] args) 
    {
        int [] arr = {9,8,7,6,5,4,3,2,1};
        char [] arr2 = {'B','V','A','Z','z','a'};

 /*        
        // Sorting Whole array elements
        Arrays.sort(arr);
        Arrays.sort(arr2);

*/
        
        //Sorting SubArray 
        Arrays.sort(arr, 2, 4);
        Arrays.sort(arr2,1,4);
        
        
        
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }    
}
