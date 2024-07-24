package Arrays.WindowSlidingTechnique.CountDistinctElementsInEveryWindowsOfSizeK;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
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

/* 
    // Approach-01 //Use Linked Hash Set

        int start=0, count=0;
        Set<Integer> set = new LinkedHashSet<>();

        for(int i=start;i<(len-k+1);i++)
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
*/

    // Approach-02 Incomplete
                
        //create Window
        List<Integer> window = new LinkedList<>();
        List<Integer> result = new LinkedList<>();

        for(int i=0;i<k;i++)
        {
            window.add(arr[i]); //k elements
        }

        Set<Integer> set = new LinkedHashSet<>();
        for(int i=k;i<=len;i++)
        {
            System.out.println("window : "+window);
            set.clear();
            for (Integer integer : window) 
            {
                set.add(integer);
            }
            result.add(set.size());

            window.remove(0);
            
            if(i<len)
              window.add(arr[i]);
        }

        System.out.println("Result : "+result);


    }
}
