package Searching.BinarySearch;

import java.util.Scanner;

public class FindSquareRoot {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

        // Approach-01
        System.out.println((int)Math.sqrt(numb));
        System.out.println(Math.floor(Math.sqrt(numb)));

        // Approach-02 
        int i = 1;
        while(i*i<=numb)
        {
            i++;
        }
        System.out.println(i-1);

        // Approach-03
         
        int temp = sqrtFloor(numb);
        System.out.println(temp);

    }

    private static int sqrtFloor(int numb)
    {
        int start = 1 ;
        int end = numb;
        int ans = -1;

        while(start<=end)
        {
            int mid = (start+end)/2;
            int midSqr = mid*mid;

            if(midSqr<numb)
            {
                start = mid+1;
                ans = mid;
            }
            else if(midSqr>numb)
                end = mid-1;
            else
            {
                return mid;
            }    

        }

        return ans;
    }
}
