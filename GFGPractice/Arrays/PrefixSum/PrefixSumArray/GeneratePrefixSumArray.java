package Arrays.PrefixSum.PrefixSumArray;

import java.util.Arrays;

public class GeneratePrefixSumArray {
    public static void main(String[] args) 
    {
        int[] arr = {3,4,8,-9,20,6};  

        System.out.println("Arrays : "+Arrays.toString(arr));
        int sum = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            sum = sum+arr[i];
            arr[i]=sum;
        }

        System.out.println("Prefix Sum Array : "+Arrays.toString(arr));


    }
}
