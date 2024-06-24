package Arrays.EnterElementInArrayAtAnyPosition;

import java.util.Scanner;

public class EnterElementAtPosition {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element to Enter : ");
        int ele = sc.nextInt();
        System.out.print("Enter postion : ");
        int pos = sc.nextInt();

        int[] arr = new int[5];
            arr[0]=12;
            arr[1]=2;
            arr[2]=32;
        
        // Approach-01
        insert(arr,ele,pos);        
    }

    private static void insert(int[] arr, int ele, int pos) 
    {
        int arrSize = arr.length;
        if(arr[arrSize-1]==0)
        {
             
        }
    }
}
