package Arrays.FindMxSum;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxSum {
    public static void main(String[] args) 
    {
        int[] arr = {1,8,30,-5,20}; //  k=3 Ans = 45, k=2 Ans = 38

        System.out.println("Array : "+Arrays.toString(arr));
        int len = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k : ");
        int k = sc.nextInt();

        
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


    }
}
