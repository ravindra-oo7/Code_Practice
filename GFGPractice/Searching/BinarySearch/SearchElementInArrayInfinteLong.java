package Searching.BinarySearch;

public class SearchElementInArrayInfinteLong 
{
    public static void main(String[] args) 
    {
        //consider arr has infinte elements
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};   
        //int x = 1; // ans = 0
        //int x = 3; // ans =  2      
        int x = 5; // ans = 4
        // Approach-01
        int ans = search(arr,x);
        System.out.println(ans);
        
    }
    
    private static int search(int[] arr, int x) 
    {
        if(arr[0]==x)
            return 0;

        int i=1;
        while(arr[i]<x)
        {
            i = i*2;
            if(arr[i]==x)
                return i;
        }
        return binarySearch(arr,x,(i/2)+1,i);
    }

    private static int binarySearch(int[] arr, int x, int start , int end)
    {
        while(start<=end)
        {
            int mid = (start+end)/2;

            if(arr[mid]>x)
                end = mid-1;
            else if(arr[mid]<x)
                start = mid+1;
            else
            {
                if(arr[mid]!=arr[mid-1])
                    return mid;
                else
                    end = mid-1;    
            }        
        }
        return -1;
    }
}
