package Searching.BinarySearch;

import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,6,7};    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element to Search : ");
        int k = sc.nextInt();
        
        int start = 0;
        int end = arr.length-1;
        search(arr,k,start,end);

    }

    private static void search(int[] arr, int k, int start, int end ) 
    {
        if(start>end)
        {
            System.out.println("Element not Found!!!");
            return;
        }
        int mid = (start+end)/2;

        if(arr[mid]==k)
        {
            System.out.println("Element found ");
            System.exit(0);
        }
        else if(arr[mid]>k)
            search(arr, k,start,mid-1);
        else 
            search(arr, k, mid+1, end);    
              
    }
}
