package Searching.BinarySearch;

public class IndexOfLastOccurance 
{
    public static void main(String[] args) 
    {
        int[] arr = {10,10,10,20,20,40,40};
        int len = arr.length;

       // int k = 20; // ans = 4
        //int k = 2; // ans = -1
        int k = 10; // ans = 2

/* 
        // Approach-01
        for(int i=len-1;i>=0;i--)
        {
            if(arr[i]==k)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
*/

        // Approach-02 Recursive Approach
        int start = 0;
        int end = len-1;
        int reasult = search(arr,k,start,end);

        System.out.println(reasult);
        
    }

    private static int search(int[] arr, int k, int start, int end) 
    {
        if(start>end)
        return -1;

        int mid = (start+end)/2;

        if(arr[mid]>k)
            return search(arr, k, start, mid-1);
        else if(arr[mid]<k)   
            return search(arr, k, mid+1, end); 
        else
            {
                if(mid==0 || arr[mid]!=arr[mid+1])
                    return mid;
                else
                    return search(arr, k, mid+1, end);
            }    
    }    
}
