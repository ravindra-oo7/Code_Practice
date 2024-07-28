package Searching.BinarySearch;

public class CountOnesInBinaryArray {
    public static void main(String[] args) 
    {
        //int[] arr = {0,0,0,1,1,1,1}; 
        int[] arr = {0,0,0,0};
        int len = arr.length;
        
        
        // Approach-01
        int counter = 0;
        for(int i=0;i<len;i++)
        {
            if(arr[i]==1)
            {
                counter++;
            }
        }
        System.out.println("1 : "+counter);


    }
}
