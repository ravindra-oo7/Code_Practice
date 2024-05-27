package StringCodes.O15ReverseTheString;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String strInput = sc.next();

/* 
        //Approach-01 Using StringBuilder
        StringBuilder strBD = new StringBuilder(strInput);
        System.out.println(strBD.reverse());
 */

        //Approach-02 Using a Character Array
        char [] charArr = strInput.toCharArray();
        for(int i=charArr.length-1;i>=0;i--)
        {
            System.out.print(charArr[i]);
        }

        //Approach-03 Using Recursion
        System.out.println(reverseString(strInput));

    }

    private static String reverseString(String str) 
    {
       if(str.isEmpty())
       {
        return str;
       }
       else{
        return reverseString(str.substring(1))+str.charAt(0);
       }
    }
}
