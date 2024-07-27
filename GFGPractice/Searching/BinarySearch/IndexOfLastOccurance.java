package Searching.BinarySearch;

public class IndexOfLastOccurance 
{
    public static void main(String[] args) 
    {
        int[] arr = {10,15,20,20,40,40};
       // int k = 20; // ans = 3
        int k = 2; // ans = -1

        // Approach-01
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==k)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
        
    }    
}
