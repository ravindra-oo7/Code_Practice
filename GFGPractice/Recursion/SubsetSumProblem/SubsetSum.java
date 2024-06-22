package Recursion.SubsetSumProblem;

import java.util.Scanner;

public class SubsetSum {
    public static void main(String[] args) 
    {
        int[] intArr = {10,5,2,3,6};

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Sum Of Subset : ");
        int sum = sc.nextInt();

        int n = intArr.length;
       System.out.println( "No Of Subsets : "+countSubsets(intArr,n,sum));



    }

    private static int countSubsets(int[] intArr, int n, int sum) 
    {
        if(n==0) 
            return (sum==0)? 1:0;

        return countSubsets(intArr,n-1,sum)+countSubsets(intArr, n-1, sum-intArr[n-1]);    

    }
}
