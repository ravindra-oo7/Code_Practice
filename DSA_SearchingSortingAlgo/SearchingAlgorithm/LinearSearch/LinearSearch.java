package DSA_SearchingSortingAlgo.SearchingAlgorithm.LinearSearch;

import java.util.Scanner;

public class LinearSearch 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4,2,6,3,7,1,9,0};
        System.out.print("Enter Element to search : ");
        int item = sc.nextInt();
        
        for (int i=0;i<arr.length;i++) 
        {
            if(arr[i]==item)
            {
                System.out.println("Element Found at index "+ i+" .");
                return;
            }   
        }
        System.out.println("Element Not Found!!!");
    }
}
