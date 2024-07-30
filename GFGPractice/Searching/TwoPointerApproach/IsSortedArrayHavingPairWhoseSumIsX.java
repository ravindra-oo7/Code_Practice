package Searching.TwoPointerApproach;

public class IsSortedArrayHavingPairWhoseSumIsX {
    public static void main(String[] args) 
    {
        int[] arr = {2,5,8,12,30};
        int x = 17; // ans = Yes 5+12=17

        int len = arr.length;


        // Approach-01
        boolean isFound = false;

        int start = 0;
        int end = len-1;

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
