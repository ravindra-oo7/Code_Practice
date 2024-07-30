package Searching.TwoPointerApproach;

public class IsSortedArrayHavingPairWhoseSumIsX {
    public static void main(String[] args) 
    {
        int[] arr = {2,5,8,12,30};
        int x = 17; // ans = Yes 5+12=17
        //int x = 33; // ans = No 
        
        int len = arr.length;

// If Array is Unsorted then
    // 1) Go with Hashing Approach { O(n)time + O(n)extra Space}
    // 2) Sort the Array and Do this Two Pointer Approch { O(nlogn) }

    // The Sort+Two Pointer is Always Prefer over Hashing


        // Approach-01
        int start = 0;
        int end = len-1;
        boolean isFound = false;
        
        while(start<end) 
        {
            int sum = arr[start]+arr[end] ;
            System.err.println(arr[start]+" + "+arr[end]+" = "+sum);
            if(sum==x)
            {
                isFound = true;
                break;
            }
            else if(sum>x)
                end--;
            else
                start++;        
        }

        if(isFound)
            System.out.println("Yes");
        else
            System.out.println("No");    

    }
}
