package StringCodes.O21SwapTwoStrings;

import java.util.Scanner;

public class SwapTwoStrings {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String1 :");
        String str1 = sc.next();
        System.out.print("Enter String2 :");
        String str2 = sc.next();
        
        System.out.println("String Before Swap");
        printStrings(str1,str2);

    //Swapping Proccess
 /*    
        //Approach-01 Using third variable
        String temp = str1;
        str1=str2;
        str2=temp;
 */
        //Approach-02 Without using variable
        str1 = str1+str2;
        str2 = str1.substring(0, str1.length()-str2.length());
        str1 = str1.substring(str2.length());


        System.out.println("String After Swap");
        printStrings(str1,str2);


    }

    public static void printStrings(String str1,String str2)
    {
        System.out.println("String1 : "+str1);
        System.out.println("String2 : "+str2);
    }
}
