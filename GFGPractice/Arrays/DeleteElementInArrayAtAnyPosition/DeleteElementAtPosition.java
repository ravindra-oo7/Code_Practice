package Arrays.DeleteElementInArrayAtAnyPosition;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementAtPosition {
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        int[] arr = {12,2,32,42,65};

        System.out.println("Array Before Delete : "+ Arrays.toString(arr));
        
        System.out.print("Enter element index to delete : ");
        int pos = sc.nextInt();

        // Approach-01
        delete(arr,pos);        
        System.out.println("Array After Delete : "+ Arrays.toString(arr));
        
    }

    private static void delete(int[] arr, int pos) 
    {
        
        for(int i=pos;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }

        arr[arr.length-1]=0;

    }
}
