package NumberCodes.O17SecondLargestNumb;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumb {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Length : ");
        int arrLength = Math.abs(sc.nextInt());
        int[] arr = new int[arrLength];

        for(int i=0;i<arrLength;i++)
        {
            System.out.print("arr["+i+"] : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array : "+Arrays.toString(arr));
/* 
    //Approach-01
        //Sort array
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("2nd largest element : "+arr[arr.length-2]);
*/

    //Approach-02
        int largest = 0;
        int secondLar = 0;

        for(int numb:arr)
        {
            if(numb>=largest)
            {
                secondLar=largest;
                largest=numb;
            }
            else if(numb>=secondLar && numb<largest)
            {
                secondLar=numb;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Second largest number : "+secondLar);

    }
}
