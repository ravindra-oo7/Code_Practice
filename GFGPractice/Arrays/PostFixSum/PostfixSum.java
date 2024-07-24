package Arrays.PostFixSum;

import java.util.Arrays;

public class PostfixSum {
    public static void main(String[] args) 
    {
        int[] arr = {3,4,8,-9,20,6};  
        System.out.println("Array : "+Arrays.toString(arr));

        int len = arr.length;
        int sum = arr[len-1];
        
        for(int i=len-2;i>=0;i--)
        {
            sum = sum + arr[i];
            arr[i]=sum;
        }

        System.out.println("Postfix Array: "+Arrays.toString(arr));

    }
}
