package Searching.BinarySearch;

public class SearchElementInSortedAndRoatatedArray 
{
    public static void main(String[] args) 
    {
        int[] arr = {10,20,30,40,50,8,9};    
        //int x = 30; // ans = 2
        //int x = 8; // ans = 5
        int x = 99; // ans = -1

        int len = arr.length;

/* 
        // Approach-01 naive solution
        for(int i=0;i<len;i++)
        {
            if(arr[i]==x)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
*/

        // Approach-02
        int result = search(arr,x);
        System.out.println(result);

    }

    private static int search(int[] arr, int x) 
    {
        
        int start = 0;
        int end = arr.length-1;
                
        while (start<=end) 
        {     
            int mid = (start+end)/2;
            if(arr[mid]==x)
                return mid;
            
            if(arr[start]<arr[mid])
            {
                if(x>=arr[start] && x<arr[mid])
                    end = mid-1;
                else
                    start=mid+1;    
            }
            else
            {
                if(x>arr[mid] && x<=arr[end])
                    start = mid+1;
                else
                    end = mid-1;
            }
        }

        return -1;

    }
}
