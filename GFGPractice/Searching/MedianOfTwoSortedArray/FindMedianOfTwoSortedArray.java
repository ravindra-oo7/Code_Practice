package Searching.MedianOfTwoSortedArray;

import java.util.Arrays;

public class FindMedianOfTwoSortedArray 
{
    public static void main(String[] args) 
    {
        // int[] arr1 = {10,20,30,40,50};    
        // int[] arr2 = {5,15,25,35,45}; // ans = 27.5

        // int[] arr1 = {1,2,3,4,5,6};
        // int[] arr2 = {10,20,30,40,50}; // ans = 6

        int[] arr1 = {10,20,30,40,50,60};
        int[] arr2 = {1,2,3,4,5}; // ans = 10
 
        int len1 = arr1.length;
        int len2 = arr2.length;


        // Approach-01

        int[] arrFinal = new int[len1+len2];
        System.arraycopy(arr1, 0, arrFinal, 0, len1);
        System.arraycopy(arr2, 0, arrFinal, len1, len2);
        Arrays.sort(arrFinal);
        System.out.println("arrFinal After : "+Arrays.toString(arrFinal));

        int lenFinal = arrFinal.length;

        if(lenFinal%2==0)
        {
            double sum = (double)(arrFinal[(lenFinal/2)-1] + arrFinal[lenFinal/2]);

            System.out.println(sum/2);
        }
        else
        {
            System.out.println(arrFinal[lenFinal/2]);
        }

    }    
}
