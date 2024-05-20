package StarPyramid;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args)
	{
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows To Print Pyramid : ");
        int rows = sc.nextInt();

        for(int i=0; i<rows;i++)
        {
            for(int j=rows-1;j>i;j--)
            {
                System.out.print(" "); //Print space
            }

            for(int j=0;j<=i;j++)
            {
                System.out.print("* "); //Print space
            }

            System.out.println(""); //Enter To Next Line
        
        }
    }
}
