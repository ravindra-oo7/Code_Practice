package Arrays.WindowSlidingTechnique.FindSubArrayOfGivenSum;

import java.util.Arrays;
import java.util.Scanner;

public class FindSubArrOfGivenSum {
    public static void main(String[] args) 
    {
        //int[] arr = {1,4,20,3,10,5};
        int[] arr = {4,7,-3,1,2};

        System.out.println("Array : "+Arrays.toString(arr));    
        int len = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sum to find if SubArray is Present : ");
        int sum = sc.nextInt();

/*         
        // Approach-01 Naive solution
        boolean isPresent = false;
        for(int i=0;i<len;i++)
        {
            int tempSum = 0;

            for(int j=i;j<len;j++)
            {
                tempSum = tempSum+arr[j];
                if(sum==tempSum)
                {
                    isPresent = true;
                    break;
                }
            }
            if(isPresent)
            {
                System.out.println("Given Sum Is Possible Using SubArray");
                break;
            }

        }
        if(!isPresent)
        {
            System.out.println("Given Sum is not Possible !!");
        }
*/

        // Approach-02 Sliding Window technique 
        `        

        int tempSum = 0;
        int counter = 0;

        for(int i=0;i<len;i++)
        {
            if(tempSum<sum)
            {
                tempSum = tempSum + arr[i];
            }
            
            while(tempSum>sum)
            {
                tempSum = tempSum-(arr[counter]);
                counter++;
            }
            if(tempSum == sum)
            {
                System.out.println("Sum Is Possible using SubArray");
                System.exit(0);
            }
        }
        System.out.println("Sum Not Possible !!!");

    }
    
}
