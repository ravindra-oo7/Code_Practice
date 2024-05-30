package StringCodes.O21RemoveAllWhitespaces;

import java.util.Scanner;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

/*     
    //Approach-01
        StringBuilder strBD = new StringBuilder();
        String [] strArr = str.trim().split("\\s+");   
        
        for (String string : strArr) 
        {
            strBD.append(string);
        }
        System.err.println(strBD);
*/

    //Approach-o2
        String finalstr = str.replaceAll("\\s+", "");   
        System.out.println(finalstr);


    }
}
