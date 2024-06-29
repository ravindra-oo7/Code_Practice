package Arrays.ReverseAnArray;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) 
    {
        int [] intArr = new int[] {1,2,3,4,5,6,7,8,9};  
        System.out.println("OrignalArray : "+Arrays.toString(intArr));

        // Approach-01
        int j=0;
        int [] revArr = new int[intArr.length];
        for(int i=intArr.length-1;i>=0;i--)
        {
            revArr[j] = intArr[i];
            j++;
        }
        System.out.println("Reversed Array : "+Arrays.toString(revArr));

    }
}
