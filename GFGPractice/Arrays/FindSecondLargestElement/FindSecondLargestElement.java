package Arrays.FindSecondLargestElement;

import java.util.Arrays;
import java.util.Scanner;

public class FindSecondLargestElement {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] intArr = {10,5,20,8,4,65,2,43,2,0,245};
        System.out.println("Array : "+Arrays.toString(intArr));

        // Approach-01
        int largest = 0;
        int secLargest = 0;
        int pointer=0;
        for(int i=0;i<intArr.length;i++)
        {
            if(largest<intArr[i])
            {
                int temp = largest; 
                largest = intArr[i];
                secLargest = temp;
            }   
        }
        System.out.println("Second Largest Element : "+secLargest);
        System.out.println("Second Largest Elements Index : "+ pointer);
    }
}
