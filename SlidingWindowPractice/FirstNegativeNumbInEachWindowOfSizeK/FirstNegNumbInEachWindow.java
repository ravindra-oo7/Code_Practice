package FirstNegativeNumbInEachWindowOfSizeK;

import java.util.Arrays;
import java.util.Scanner;

public class FirstNegNumbInEachWindow {
    public static void main(String[] args) 
    {
        int[] arr = {12,-1,-7,8,-15,30,16,28};
        System.out.println("Array : "+Arrays.toString(arr));
        
        int len = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SubArray Size : ");
        int k = sc.nextInt();

        // Approach-01

        for(int i=0;i<=len-k;i++) //len=8 k=3 =>5
        {
            for(int j=i;j<i+k;j++) //
            {
                if(arr[j]<0)
                {
                    System.out.print(arr[j]+"  ");
                    break; 
                }
                else if(j==(i+k-1))
                {
                    System.out.print(0+"  ");
                }
            }
        }


    }
}
