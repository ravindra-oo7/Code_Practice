package Searching.AllocateMinimumNoOfPages;

public class AllocateMinimumNoOfPages {
    public static void main(String[] args) 
    {
    // Minimize the maximum pages allocated
    //Only contiguous pages can be allocated


        // int[] arr = {10,20,30,40};
        // int k = 2; // ans = 60

        // int[] arr = {10,20,30};
        // int k = 1; // ans = 60

        int[] arr = {10,5,30,1,2,5,10,10};
        int k = 3; // ans = 30


        int len = arr.length;

        // Approach-01 Naive Solution
        int result = minPages(arr,len,k);
        System.out.println("Ans : "+result);

    }

    private static int minPages(int[] arr,int len, int k) 
    {
        if(k==1)
            return sum(arr,0,len-1);   

        if(len==1)
            return arr[0];

        int res = Integer.MAX_VALUE;

        for(int i=1;i<len;i++)
        {
            res = Math.min(res, Math.max(minPages(arr,i,k-1),sum(arr,i,len-1)));
        }
        
        return res;      
    }

    private static int sum(int[] arr, int b, int len) 
    {
       int sum = 0;
       for(int i=b;i<=len;i++)
       {
        sum = sum+ arr[i];
       }
       return sum;

    }


    
}
