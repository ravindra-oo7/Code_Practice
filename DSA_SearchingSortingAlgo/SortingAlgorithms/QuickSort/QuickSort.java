package DSA_SearchingSortingAlgo.SortingAlgorithms.QuickSort;

import java.util.Arrays;

public class QuickSort 
{
    public static void main(String[] args) 
    {
        int[] arr = {4,6,2,5,7,9,1,3};  // 8
        System.out.println("Orignal Array :"+Arrays.toString(arr));
        
        // Approach-01
        arr = quickSort(arr);
        System.out.println("Sorted Array :"+Arrays.toString(arr));

    }

    private static int[] quickSort(int[] arr) 
    {
        qs(arr,0,arr.length-1);
        return arr;
    }

    private static void qs(int[] arr, int low, int high) 
    {
        if(low<high)
        {
            int pIndex = partition(arr,low,high);
           // System.out.println("Processing Array:"+ Arrays.toString(arr)); // Uncomment to watch array sorting proccess
            qs(arr, low, pIndex-1);
            qs(arr,pIndex+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) 
    {
        int pivote = arr[low];
        int i = low;
        int j = high; 

        while(i<j)
        {
            while(arr[i]<=pivote && i<= high-1)
            {
                i++;
            }
            while(arr[j]>pivote && j>= low+1)
            {
                j--;
            }

            if(i<j)
            {
                // Swap //
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;

    }

    
}
