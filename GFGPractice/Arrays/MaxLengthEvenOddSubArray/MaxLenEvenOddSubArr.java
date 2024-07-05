package Arrays.MaxLengthEvenOddSubArray;

public class MaxLenEvenOddSubArr {
    public static void main(String[] args) 
    {
        int[] arr =  {10,12,14,7,8}; // Ans = 3
        //int[] arr = {7,10,13,14}; // Ans = 4
        //int[] arr = {10,12,8,4}; // Ans = 1

/* 
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
                    counter = 1;
                }
            }
        }
        System.out.println("Max Len : "+max);
*/       

 /* 
        // Approach-02
        int max = 1;
        int len = arr.length;

        for(int i=0;i<len;i++)
        {
            int counter = 1;
            for(int j=i+1;j<len;j++)
            {
                if( (arr[j]%2 == 0 && arr[j-1]%2 != 0) ||
                    (arr[j]%2 != 0 && arr[j-1]%2 == 0))
                {
                    counter++;
                }
                else
                {
                    break;
                }

            }
            max = Math.max(max, counter);
        } 
        System.out.println("Max Len : "+max);
*/

        // Approach-03
        int max = 1;
        int counter = 1;

        for(int i=1;i<arr.length;i++)
        {
            if( (arr[i-1]%2 == 0 && arr[i]%2 != 0) ||
                (arr[i-1]%2 != 0 && arr[i]%2 == 0))
            {
                counter++;
                max = Math.max(max, counter);
            }
            else
            {
                counter=1;
            }
        }
        System.out.println("Max Len = "+max);

    }
}
