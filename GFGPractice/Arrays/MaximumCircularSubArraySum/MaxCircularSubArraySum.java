package Arrays.MaximumCircularSubArraySum;

public class MaxCircularSubArraySum {
    public static void main(String[] args) 
    {
        //int[] arr = {10,5,-5}; // Max = 15
        //int[] arr = {5,-2,3,4}; // Max = 12
        //int[] arr = {8,-4,3,-5,4}; // Max = 12
        int[] arr = {3,-4,5,7,-8,7}; // Max = 18

        int len = arr.length;


     // Approach-01 Incomplete
        int max = arr[0];
        int endMax = arr[0];
        int counter = 0;

        for(int i=1;i<len;i++)
        { 
            counter++; // to calculate maximum iterations
           
            endMax = endMax + arr[i];
            endMax = Math.max(endMax, arr[i]);
            max = Math.max(endMax, max);

            if(max>endMax)
            {
                counter = 0;
                endMax = 0;
                continue;
            }

            if(i==len-1  && counter<len)
            {
                i=-1;
            }
        }

        System.out.println("Max : "+max);


/* 
        // Approach-02 by GFG
        int max = arr[0];
        for(int i=0;i<len;i++)
        {
            int currMax = arr[i];
            int currSum = arr[i];

            for(int j=1;j<len;j++)
            {
                int index = (i+j)%len;
                currSum = currSum + arr[index];
                currMax = Math.max(currMax, currSum);
            }

            max = Math.max(max,currMax);
        }
        System.out.println("Max : "+ max);
*/


    }
}
