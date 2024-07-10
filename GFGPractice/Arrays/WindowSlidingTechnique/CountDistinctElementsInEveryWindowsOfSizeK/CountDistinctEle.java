package Arrays.WindowSlidingTechnique.CountDistinctElementsInEveryWindowsOfSizeK;

import java.util.Arrays;
import java.util.Scanner;

public class CountDistinctEle {
    public static void main(String[] args) 
    {
        int[] arr = {1,2,1,3,4,3,3};   
        
        int len = arr.length;
        System.out.println("Array : "+Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Windows size : ");
        int k = sc.nextInt();


        // Approach-01 //Use Linked Hash Set
        int start=0, end=k, count=0;

        for(int i=start;i<end;i++)
        {
            boolean isDistinct = true;
            for(int j=i+1;j<end;j++)
            {
                if(arr[i]==arr[j])
                {
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct)
            {
                count++;
            }
        }



    }
}
