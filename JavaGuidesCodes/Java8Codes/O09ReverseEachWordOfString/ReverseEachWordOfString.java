package Java8Codes.O09ReverseEachWordOfString;

import java.util.Scanner;

public class ReverseEachWordOfString {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        //Approach-01
        String[] strArr = str.split("\\s+");

        for (int i=0;i<strArr.length;i++) 
        {
            String string = strArr[i];

            for (int j=string.length()-1;j>=0;j--) 
            {
                System.out.print(string.charAt(j));
            }   

            System.out.print(" "); 
        }


    }
}
