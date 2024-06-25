package Arrays.DeleteElementInArrayAtAnyPosition;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementAtPosition {
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element index to delete : ");
        int pos = sc.nextInt();

        int[] arr = new int[5];
            arr[0]=12;
            arr[1]=2;
            arr[2]=32;
        
        // Approach-01
        System.out.println("Array Before Delete : "+ Arrays.toString(arr));
        delete(arr,pos);        
        System.out.println("Array After Delete : "+ Arrays.toString(arr));
        
    }

    private static void delete(int[] arr, int pos) 
    {
    
        

    }
}
