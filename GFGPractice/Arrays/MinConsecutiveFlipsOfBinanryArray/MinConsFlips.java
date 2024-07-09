package Arrays.MinConsecutiveFlipsOfBinanryArray;

import java.util.Arrays;

public class MinConsFlips {
    public static void main(String[] args) 
    {
        //int[] arr = {0,0,1,1,0,0,1,1,0}; // 2 flips 2 to 3 and 6 to 7
        //int[] arr = {1,1,0,0,0,1}; // 1 flip from 2 to 4
        //int[] arr = {1,0,0,0,1,0,0,1,1,1,1}; // 2 flips from 1 to 3 and 5 to 6
        int[] arr = {1,1,1};

        int len = arr.length;
        System.out.println("Array : "+Arrays.toString(arr));

        // Approach-01
        if(arr[0]==arr[len-1])
        {
            boolean print = true;
            for(int i=1;i<len;i++)
            {
                if(arr[i]!=arr[0])
                {
                    arr[i]=arr[0];
                    if(print)
                    {
                        System.out.print("Flip the Array from Index "+i+" to ");
                        print=false;
                    }
                }
                else
                {
                    if(!print)
                    {
                        System.out.println((i-1)+".");
                        print=true;
                    }
                }
            }


        }
        else
        {
            boolean print=true;
            for(int i=0;i<len;i++)
            {
                if(arr[i]!=arr[0])
                {
                    arr[i]=arr[0];
                    if(print)
                    {
                        System.out.print("Flip the Array from Index "+i+" to ");
                        print=false;                    
                    }
                }
                else
                {
                    if(!print)
                    {
                        System.out.println((i-1)+".");
                        print=true;
                    }
                }
            }
        }

        System.out.println("Array After Flip : "+Arrays.toString(arr));

    }
}
