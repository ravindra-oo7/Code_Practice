package Arrays.MaximumDifference;

public class MaxDiff {
    public static void main(String[] args) 
    {
        //Maximum value of arr[j]-arr[i]
        //such that j>i

        //int[] arr = {2,3,10,6,4,8,1};//8
        //int[] arr = {7,9,5,6,3,2};
        int[] arr = {30,10,8,2};//-2

    // Approach-01

        int maxDiff =arr[1]-arr[0]; 
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int currDiff = arr[j]-arr[i];
                if(currDiff>maxDiff)
                {
                    maxDiff = currDiff ;
                }
            }
        }
        System.err.println("Maximum Diff : "+maxDiff);

    }
}
