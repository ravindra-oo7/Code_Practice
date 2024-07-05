package Arrays.MaxLengthEvenOddSubArray;

public class MaxLenEvenOddSubArr {
    public static void main(String[] args) 
    {
        //int[] arr =  {10,12,14,7,8}; // Ans = 3
        //int[] arr = {7,10,13,14}; // Ans = 4
        int[] arr = {10,12,8,4}; // Ans = 1

        // Approach-01
        int max = 1;
        int counter = 1;
        boolean isEven = true;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]%2 ==0)
            {
                isEven = true;
            }
            else
            {
                isEven = false;
            }

            if(isEven)
            {
                if(arr[i]%2 != 0)
                {
                    counter++;
                    max = Math.max(max, counter);
                }
                else
                {
                    max = Math.max(max, counter);
                    counter = 1;
                }
            }
            else            
            {
                if(arr[i]%2 == 0)
                {
                    counter++;
                    max = Math.max(max, counter);
                }
                else
                {
                    max = Math.max(max, counter);
                    counter = 1;
                }
            }
        }
        System.out.println("Max Len : "+max);

    }
}
