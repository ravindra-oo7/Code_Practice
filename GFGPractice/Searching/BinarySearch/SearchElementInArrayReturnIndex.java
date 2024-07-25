package Searching.BinarySearch;

import java.util.Scanner;

public class SearchElementInArrayReturnIndex 
{
    public static void main(String[] args) 
    {
        //int[] arr = {1,2,3,4,5,6}; //find k=2
        int[] arr = {5,15,25}; //k=25
        //int[] arr = {5,10,15,25,35}; //k=20
        //int[] arr = {10,10}; //k=10
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element To Search : ");
        int k = sc.nextInt();

        int len = arr.length;
        int index = -1;


        // Approach-01
        for(int i=0;i<len;i++)
        {
            if(arr[i]==k)
            {
                index = i;
                break;
            }
        }

        if(index!=-1)
            System.out.println(k+" Present at Index : "+index);
        else
            System.out.println(k+" Not Present in Array !!!");
    }
}
