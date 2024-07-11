package MaxSumSubArrayOfSizeK;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumSubArrayOfSizeK {
    public static void main(String[] args) 
    {
        int[] arr = {2,5,1,8,2,9,1};
        int len = arr.length;

        System.out.println("Array : "+Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SubArray Size : ");
        int winSize = sc.nextInt();

        // Approach-01

            int maxSum=Integer.MIN_VALUE;
            int currSum = 0;
            //Create window
            for(int i=0;i<winSize;i++)
            {
                currSum = currSum+arr[i];
                maxSum = Math.max(maxSum, currSum);
            }

            for(int i=winSize;i<len;i++)
            {
                currSum=currSum+(arr[i]-arr[i-winSize]);
                maxSum = Math.max(maxSum, currSum);
            }

            System.out.println("Maximum sum of SubArray of size "+winSize+" is "+maxSum);


    }
}
