package Searching.BinarySearch;

public class FindPeakElement {
    public static void main(String[] args) 
    {
        int[] arr = {5,10,20,15,7}; // ans = 20
        //int[] arr = {10,20,15,5,23,90,67}; // ans = 20
        //int[] arr = {80,70,60}; // ans = 80
        //int[] arr = {1,2,3,4}; // ans = 4


        int len = arr.length;
        
        // Approach-01 naive solution
        if(arr[0]>arr[1])
        {
            System.out.println(arr[0]);
            return ;
        }

        for(int i=1; i<len-2;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                System.out.println(arr[i]);
                return ;
            }
        }

        if(arr[len-1]>arr[len-2])
        {
            System.out.println(arr[len-1]);
            return ;
        }




    }
}
