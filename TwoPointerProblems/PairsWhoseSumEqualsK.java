package TwoPointerProblems;

public class PairsWhoseSumEqualsK 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,4,4,5,5,5,6,6,11}; //Ans =6 pairs
        int k = 11; //sum should be 11


        // Approach-01
        int counter = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==k)
                {
                    counter++;
                }
            }
        }

        System.out.println("Pairs : "+counter);

    }
}
