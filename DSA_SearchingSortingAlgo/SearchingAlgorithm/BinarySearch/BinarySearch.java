package DSA_SearchingSortingAlgo.SearchingAlgorithm.BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.print("Enter Element to search : ");
        int item = sc.nextInt();

        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        while(start<=end)
        {
            if(arr[mid]==item)
            {
                System.out.println("Element found at Index : "+mid);
                return;
            }
            else if(arr[mid]<item)
                start = mid+1;
            else
                end = mid-1;

            mid = (start+end)/2;    

        }
        System.out.println("Element Not Found!!!");
    }
}
