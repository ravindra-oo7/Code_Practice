package DSA_SearchingSortingAlgo.SearchingAlgorithms.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) 
    {
        int[] arr = {38,52,9,18,6,62,13};
        //int[] arr = {1,8,3,4,5};
        System.out.println("Array : "+Arrays.toString(arr));
        
        // Approach-01
            int counter = 0;
            while(counter<arr.length) // 6 iterations
            {   
                for(int j=counter+1;j<arr.length;j++)
                {
                    if(arr[counter] > arr[j])
                    {
                        int temp = arr[j];
                        arr[j] = arr[counter];
                        arr[counter] = temp; 
                    }
                }

                counter++;
                
            }

            System.out.println("Sorted Array:"+Arrays.toString(arr));
   

        



    }
}
