package Arrays.MaxSumSubArray;

public class MaxSumSubArr {
    public static void main(String[] args) 
    {
        int[] arr = {1,-2,3,-1,2};
        
        // Approach-01
        int max = arr[0];
        int len = arr.length;

        for(int i=0;i<len;i++)
        {
            int curr = 0;
            for(int j=i;j<len;j++)
            {
                curr = curr+arr[j];
                max = Math.max(max, curr);
            }
        }
        System.out.println("max Sum = "+max);
    }
}
