package SortingAlgorithms.ArraysSortMethod;

import java.util.Arrays;

public class ArraysSortMethod 
{
    public static void main(String[] args) 
    {
        int [] arr = {5,20,12,30,2,33,44};
        char [] arr2 = {'B','V','A','Z','z','a'};

 /*        
        // Sorting Whole array elements
        Arrays.sort(arr);
        Arrays.sort(arr2);

*/
        
        //Sorting SubArray 
        Arrays.sort(arr, 2, 5);
        Arrays.sort(arr2,1,4);
        
        
        
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }    
}
