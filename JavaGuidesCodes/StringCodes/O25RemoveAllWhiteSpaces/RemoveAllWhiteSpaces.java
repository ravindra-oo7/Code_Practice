package StringCodes.O25RemoveAllWhiteSpaces;

import java.util.Scanner;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
/* 
    //Approach-01
        String finalStr = str.trim().replaceAll("\\s+","");
        System.out.println(finalStr);
*/
    //Approach-02 
        StringBuilder strBD = new StringBuilder();
        String[] strArr = str.trim().split(" ");
        
        for (String string : strArr) 
        {
            strBD.append(string);
        }
        System.out.println(strBD);
    }
}
