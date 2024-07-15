package MaximumOfAllSubArraysOfSizeK;

import java.util.LinkedList;
import java.util.List;

public class MaxOfAllSubArrOfSizeK {
    public static void main(String[] args) 
    {
        int[] intArr = {1,3,-1,-3,5,3,6,7};
        int k = 3; 
        List<Integer> resultArr = new LinkedList();
    // Approach-01
        
        List<Integer> window = new LinkedList<>();
        int currMax = Integer.MIN_VALUE;

        for(int i=0;i<k-1;i++)
        {
            window.add(intArr[i]); 
        }

        for(int j=2;j<intArr.length;j++)
        {
            window.add(intArr[j]);
            System.out.println(window);
            if(window.size()==k)
            {
                for(int i=0;i<window.size();i++ )
                {
                    int currInt = window.get(i);
                    currMax = Math.max(currMax, currInt);
                }
                resultArr.add(currMax);
            }
            window.remove(0);
        }
        
        System.out.println("Reasult : "+resultArr);
        
    }
}
