package Searching.TwoPointerApproach;

public class IsSortedArrayHavingTripletWhoseSumIsX {
    public static void main(String[] args) 
    {
        int[] arr = {2,3,4,8,9,20,40};
        //int x = 32; // ans = Yes 4+8+20 = 32  
        //int x = 69 ; // ans = Yes 9+20+40 = 69
        int x = 5 ; // ans = No
        
        int len = arr.length;

        // Approach-01 Naive
        boolean isFound = false;

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

        if(isFound)
            System.out.println("Yes");
        else
            System.out.println("No");    
    
    }
}
