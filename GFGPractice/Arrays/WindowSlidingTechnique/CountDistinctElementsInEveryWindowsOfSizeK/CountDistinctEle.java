package Arrays.WindowSlidingTechnique.CountDistinctElementsInEveryWindowsOfSizeK;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

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
        Set<Integer> set = new LinkedHashSet<>();

        for(int i=start;i<(len-end+1);i++)
        {
            count = 0;
            set.clear();
            for(int j=i;j<k+i;j++)
            {
               if(set.add(arr[j]))
               {
                    count++;
               }
            }
            System.out.print(count+" ");
        }



    }
}
