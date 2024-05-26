package StringCodes.O11SubstringInStringCounter;

import java.util.Scanner;

public class SubStringInStringCounter {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        System.out.print("Enter SubString :");
        String subStr = sc.next();

        //Approach-01
        int count = 0;
        int index = 0;

        while((index = str.indexOf(subStr,index)) != -1)
        {
            count++;
            index += subStr.length();
        }
        System.out.println("Sunbstring "+subStr+" Occured "+ count + " times");
    }
}
