package Arrays.LeftRotateArray;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        int[] orgArr = {1,2,3,4,5,6,7,8,9};
        int arrLen = orgArr.length;
        System.out.println("Array Before rotation : "+Arrays.toString(orgArr));
 
        System.out.print("Enter rotations : ");
        int rotations = sc.nextInt();
        
        // Approach-01
        int[] rttArr = new int[arrLen];

        for(int i=0;i<arrLen;i++)
        {
            if(i+rotations<arrLen)
            {
                rttArr[i] = orgArr[i+rotations];
            }
            else
            {
                rttArr[i] = orgArr[i+rotations-arrLen];
            }
        }
        System.out.println("Array After Rotation : "+Arrays.toString(rttArr));
    }
}
