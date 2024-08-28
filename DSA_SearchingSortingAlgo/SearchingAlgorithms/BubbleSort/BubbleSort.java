package DSA_SearchingSortingAlgo.SearchingAlgorithms.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    
    public static void main(String[] args) {
        int[] arr = {36,19,29,12,5};
        System.out.println("Array: "+Arrays.toString(arr));

/*         
        // My Approach-01
        for(int i=arr.length-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("   "+j);
                //if(arr[j]>arr[j+1]) // Acending sort 
                if(arr[j]<arr[j+1]) // Decending sort
                {
                    swap(arr,j);
                }
            }
        }
*/
        
        // Approach-02
        for(int i=0;i<arr.length;i++)
        {
            int flag = 0;
            for(int j=0;j<arr.length-1-i;j++)
            {
                System.out.print("   "+j);
                //if(arr[j]>arr[j+1]) // Acending sort 
                if(arr[j]<arr[j+1]) // Decending sort
                {
                    swap(arr,j);
                    flag = 1;
                }
            }
            if(flag == 0) //reduce extra iterations if array is already sorted
            {
                break;
            }
        }
        
        System.out.println("Sorted Array : "+Arrays.toString(arr));
    }

    private static void swap(int[] arr, int j) 
    {
        int temp = arr[j+1];
        arr[j+1]=arr[j];
        arr[j]=temp;
    }
}
