package Searching.BinarySearch;

public class IndexOfFirstOccuranceOfElement 
{
    public static void main(String[] args) 
    {
        int[] arr = {5,10,10,15,15};
        int k = 15; // ans = 3
        int len = arr.length;

/*         
        // Approach-01 naive
        for(int i=0;i<len;i++)
        {
            if(arr[i]==k)
            {
                System.out.println(i);
                return;
            }    
        }
        System.out.println(-1); 
*/

        // Approach-02 Binary search -recursive
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
       {
            return search(arr, k, start, mid-1);
       }
       else if(arr[mid]<k)
       {
            return search(arr, k, mid+1, end);
       }
       else
       {
            if(mid==0 || arr[mid-1]!=arr[mid])
                return mid;
            else
                return search(arr, k, start, mid-1) ;   
       }
            
    }
}
