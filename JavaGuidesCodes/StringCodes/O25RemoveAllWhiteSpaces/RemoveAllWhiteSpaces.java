package StringCodes.O25RemoveAllWhiteSpaces;

import java.util.Scanner;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        String finalStr = str.trim().replaceAll("\\s+","");

        System.out.println(finalStr);
    }
}
