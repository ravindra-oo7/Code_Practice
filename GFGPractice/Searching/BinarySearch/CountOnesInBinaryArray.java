package Searching.BinarySearch;

public class CountOnesInBinaryArray {
    public static void main(String[] args) 
    {
        //int[] arr = {0,0,0,1,1,1,1}; // ans = 4
        int[] arr = {1,1,1,1,1}; // ans = 5
        //int[] arr = {0,0,0,0}; // ans = 0
        int len = arr.length;
        
/*        
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
*/
        // Approach-02 If Array is sorted
        int start = 0;
        int end = len-1;
        
       int lowInd =  getLowestIndexOfOne(arr,start,end);
       if(lowInd!=-1)
            System.out.println("Count : "+(len-lowInd));
        else
            System.out.println(0);
        
        
    }
    
    private static int getLowestIndexOfOne(int[] arr, int start, int end) 
    {
        while(start<=end)
        {
            int mid = (start+end)/2;
        
               if(arr[mid]<1)
                   start=mid+1;
               else
              {
                  if(mid==0 || arr[mid-1]!=1)
                    return mid;
                  else
                  {
                    end = mid-1;
                  }  
              }    
         } 
         return -1;
    }
    
}
