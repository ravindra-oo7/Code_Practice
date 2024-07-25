package Searching.BinarySearch;

public class IndexOfFirstOccuranceOfElement 
{
    public static void main(String[] args) 
    {
        int[] arr = {5,10,10,15,15};
        int k = 15; // ans = 3
        int len = arr.length;

        // Approach-01
        for(int i=0;i<len;i++)
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
