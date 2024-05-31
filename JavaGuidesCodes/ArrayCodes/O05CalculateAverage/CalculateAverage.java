package ArrayCodes.O05CalculateAverage;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int arrSize = sc.nextInt();

        int[] arrInt = new int[arrSize];
        
        for (int i=0;i<arrInt.length;i++) 
        {
            System.out.print("Enter element "+(i+1)+" : "); 
            arrInt[i] = sc.nextInt();  
        }
        System.out.println(Arrays.toString(arrInt));


    //Approach-01
        int summation = 0;

        for (int i : arrInt) 
        {
            summation+=i;
        }
        System.out.println("Average : "+(float)summation/(float)arrSize);
    

    }
}
