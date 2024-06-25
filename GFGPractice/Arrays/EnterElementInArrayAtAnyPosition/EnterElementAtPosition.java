package Arrays.EnterElementInArrayAtAnyPosition;

import java.util.Arrays;
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
        System.out.println("Array Before Insert : "+ Arrays.toString(arr));
        insert(arr,ele,pos);        
        System.out.println("Array After Insert : "+ Arrays.toString(arr));
    }   
    
    private static void insert(int[] arr, int ele, int pos) 
    {
        int arrSize = arr.length;
        if(arr[arrSize-1]==0)
        {
             for(int i=pos;i<arr.length-2;i++)
             {
                arr[i+1]=arr[i];
             }
            
             try
             {
                    arr[pos]=ele;
             }
             catch (Exception e) 
             {
                System.out.println(e.getMessage());
                System.out.println("Enter Valid Position !!!");
                System.exit(0);
            }
        
        }
    }
}
