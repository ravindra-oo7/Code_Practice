package Arrays.LeadersInArray;

import java.util.Arrays;

public class LeadersInArray {
    public static void main(String[] args) 
    {
        int[] arr = {7,10,4,3,6,5,2};  
        System.out.println("Array : "+Arrays.toString(arr));

    // Approach-01
        System.out.print("Leaders in Array : ");
        for (int i=0;i<arr.length;i++)
        {
            boolean isLeader = true;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    isLeader = false;
                    break;
                }
            }
            if(isLeader)
            {
                System.out.print(arr[i]+", ");
            }
        }

        
        
    }
}
