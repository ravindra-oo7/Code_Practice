package DSA_SearchingSortingAlgo.SearchingAlgorithms.InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) 
    {
        int[] arr = {5,1,6,2,4,3};
        System.out.println("Array : "+Arrays.toString(arr));

/* 
        // Approach-01  Bubble sort 
        for(int i=1;i<arr.length;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
*/

        // Approach-02 Insertion Sort
        for(int i=1;i<arr.length;i++)
        {
            int temp = arr[i];
            int j=i;
            while(j>0 && arr[j-1]>temp) 
            {
                arr[j] = arr[j-1];
                j--;
            }

            //The insertion point (j) is found in array 
            // as arr[j-1]<temp this is our insertion point 
            arr[j]=temp;
          
        }


        System.out.println("Sorted Array : "+Arrays.toString(arr));

    }
}
