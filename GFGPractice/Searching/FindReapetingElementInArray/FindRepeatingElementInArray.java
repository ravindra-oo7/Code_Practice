package Searching.FindReapetingElementInArray;

public class FindRepeatingElementInArray 
{
    public static void main(String[] args) 
    {
        int[] arr = {0,2,1,3,2,2};   
        int len = arr.length;

        // Approach-01 Naive solution {Time = O(n^2) and Space = O(1)}
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
        System.out.println("No Repeating Element Found!!!");


    }    
}
