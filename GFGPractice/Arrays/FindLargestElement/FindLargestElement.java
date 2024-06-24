package Arrays.FindLargestElement;

import java.util.Scanner;

public class FindLargestElement {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] intArr = {10,5,20,8};

        // Approach-01
        int largest = 0;
        int pointer=0;
        for(int i=0;i<intArr.length;i++)
        {
            if(largest<intArr[i])
            {
                largest = intArr[i];
                pointer = i;
            }
        }
        
        System.out.println("Largest Elements Index : "+ pointer);
    }
}
