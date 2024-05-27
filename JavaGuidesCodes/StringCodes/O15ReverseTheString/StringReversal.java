package StringCodes.O15ReverseTheString;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String strInput = sc.next();

        //Approach-01 Using StringBuilder
        StringBuilder strBD = new StringBuilder(strInput);
        System.out.println(strBD.reverse());

        
    }
}
