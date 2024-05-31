package ArrayCodes.O04CheckEqualityOfTwoArray;

import java.util.Arrays;

public class ArrayCompare {
    public static void main(String[] args) 
    {
        int[] arr1 = {2,3,1,4,7,6};
        int[] arr2 = {2,3,1,4,7,4};

/* 
    //Approach-01
        if(Arrays.equals(arr1, arr2))
        {
            System.out.println("Both Arrays are Equals ");
        }
        else
        {
            System.out.println("Not Equals");
        }
*/

    //Approach-02
        boolean isEqual=true;

        //Checking Array Length 
        if(arr1.length!=arr2.length)
        {
            isEqual=false;
        }

        //Checking if Array is null
        if(arr1==null || arr2==null)
        {
            isEqual = false;
        }

        //Checking Elements
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i] != arr2[i])
            {
                isEqual = false;
            }
        }

        if(isEqual)
        {
            System.out.println("Arrays are Equals ");
        }
        else
        {
            System.out.println("Not Equals !!");
        }

    }
}
