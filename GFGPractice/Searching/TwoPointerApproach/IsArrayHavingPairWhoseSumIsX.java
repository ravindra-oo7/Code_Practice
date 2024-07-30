package Searching.TwoPointerApproach;

public class IsArrayHavingPairWhoseSumIsX 
{
    public static void main(String[] args) 
    {
        int[] arr = {3,5,9,2,8,10,11};
        int x = 17;

        int len = arr.length;


        // Approach-01
        boolean isFound = false;

        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(arr[i]+arr[j]==x)
                {
                    isFound = true;
                    break;
                }
                System.out.println(i+" "+j);
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
