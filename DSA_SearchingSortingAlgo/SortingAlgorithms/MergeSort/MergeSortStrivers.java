package DSA_SearchingSortingAlgo.SortingAlgorithms.MergeSort;

import java.util.Arrays;
import java.util.ArrayList;

public class MergeSortStrivers 
{
    public static void main(String[] args) 
    {
        int[] arr = {2,5,1,3,7,8,3,6,3};   
        System.out.println("Orignal Array :"+Arrays.toString(arr));
        
        int len = arr.length; //9

        mergeSort(arr,0,len-1); //8

        System.out.println("Sorted Array :"+Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) 
    {
        if(low>=high) return;

        int mid = (low+high)/2;
        mergeSort(arr, low, mid); //left half
        mergeSort(arr, mid+1, high); //right half
        merge(arr, low, mid, high); // merging sorted halves

    }

    private static void merge(int[] arr, int low, int mid, int high) 
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low; // left Array Starting point
        int right = mid + 1; //right Array Starting point

        //Storing elements in the temporary array in sorted manner

        while(left<=mid && right<=high)
        {
            if(arr[left]<= arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else
            {
                temp.add(arr[right]);
                right++;
            }
        }

        //If Elements on the right half are completed and left half are still remain
        while (left<=mid) 
        {
            temp.add(arr[left]);
            left++;
        }

        //If Elements on the left half are completed and right half are still remain
        while (right<=high) 
        {
            temp.add(arr[right]);
            right++;    
        }

        //Transfer all elements from temp to arr
        for(int i=low; i<=high;i++)
        {
            arr[i] = temp.get(i-low);
        }
        System.out.println("Arrays : "+Arrays.toString(arr));

    }
    
}
