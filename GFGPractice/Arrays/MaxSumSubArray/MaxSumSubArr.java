package Arrays.MaxSumSubArray;

public class MaxSumSubArr {
    public static void main(String[] args) 
    {
        int[] arr = {1,-2,3,-1,2};
        
/*         
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
        System.out.println("Max Sum = "+max);
*/

        // Approach-02
        int max = arr[0];
        int maxEnd = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            maxEnd = Math.max(maxEnd+arr[i], arr[i]);
            max = Math.max(maxEnd, max);
        }
        System.out.println("Max Sum = "+max);
    }
}
