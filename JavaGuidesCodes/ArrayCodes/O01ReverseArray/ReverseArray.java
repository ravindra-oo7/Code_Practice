package ArrayCodes.O01ReverseArray;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int arrSize = sc.nextInt();
        
        int[] intArr = new int[arrSize];

        for(int i=0;i<intArr.length;i++)
        {
            System.out.print("Enter Element "+(i+1)+" :");
            intArr[i] = sc.nextInt();
        }
        System.out.println("Input Array : "+ Arrays.toString(intArr));

/* 
        //Approach-01
        int[] revArr = new int[intArr.length];
        int counter = 0;
        for(int i=intArr.length;i>0;i--)
        {
            revArr[counter] =intArr[i-1];
            counter++;
        }

        System.out.println("Reversed Array : "+Arrays.toString(revArr));
*/  
  
        //Approach-02 without using Another Array

        int startIndex = 0;
        int endIndex = intArr.length-1;

        while(startIndex<endIndex)
        {
            int temp = intArr[startIndex];
            intArr[startIndex] = intArr[endIndex];
            intArr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        System.out.println(Arrays.toString(intArr));

    }
}
