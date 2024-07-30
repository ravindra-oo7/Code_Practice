package Searching.TwoPointerApproach;

public class IsSortedArrayHavingTripletWhoseSumIsX {
    public static void main(String[] args) 
    {
        int[] arr = {2,3,4,8,9,20,40};
        int x = 32; // ans = Yes 4+8+20 = 32  
        //int x = 69 ; // ans = Yes 9+20+40 = 69
        //int x = 5 ; // ans = No
        
        int len = arr.length;
        boolean isFound = false;

/*         
        // Approach-01 Naive

        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                for(int k=i+2;k<len;k++)
                {
                    int sum = arr[i]+arr[j]+arr[k];
                    System.err.println(arr[i]+" + "+arr[j]+" + "+arr[k]+" = "+sum);

                    if(sum==x)
                    {
                        isFound = true;
                        break;
                    }
                }
                if(isFound)
                    break;
                
            }
            if(isFound)
                    break;
        }
*/

        // Approach-02 O(n^2)
        for(int i=0;i<len-2;i++)
        {
            isFound = isPair(arr,x-arr[i],i+1,len-1);
            if(isFound)
                break;
        }

        if(isFound)
            System.out.println("Sum is Possible");
        else
            System.out.println("No");    
    
    }

    private static boolean isPair(int[] arr, int sum, int start, int end) 
    {
        while(start<end)
        {
            int twoSum = arr[start]+arr[end];

            if( twoSum == sum )
            {
                System.err.println("Yes, ");
                return true;
            }
            else if(twoSum>sum)
                end--;
            else
                start++;        
        }
        return false;
    }
}
