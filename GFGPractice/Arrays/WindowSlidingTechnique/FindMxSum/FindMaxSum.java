package Arrays.WindowSlidingTechnique.FindMxSum;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxSum {
    public static void main(String[] args) 
    {
        //int[] arr = {1,8,30,-5,20}; // k=2 Ans = 38,k=3 Ans = 45, k=4 Ans = 53,k=5 Ans = 54
        int[] arr = {1,8,30,-5,20,7}; // k=2 Ans = 38,k=3 Ans = 45, k=4 Ans = 53,k=5 Ans = 60

        System.out.println("Array : "+Arrays.toString(arr));
        int len = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k : ");
        int k = sc.nextInt();

/* 
        // Approach-01
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<=len-k;i++)
        {
            int sum = 0;
            int counter=0;
            while(counter<k)
            {
                sum = sum + arr[i+counter];
                counter++;
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println("Maximum Sum for "+k+" window : "+maxSum);
*/

    // Approach-02 Window sliding method
    
        int currSum = 0;
        // Making Window
        for(int i=0;i<k;i++)
        {
            currSum = currSum+arr[i];
        }

        // Sliding Window
        int maxSum = currSum;
        for(int i=k;i<len;i++)
        {
            currSum = currSum - arr[i-k]+arr[i];
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum Sum for "+k+" window : "+maxSum);

    }
}
