package StringCodes.O22CheckIfStringEmptyOrNull;

import java.util.Scanner;

public class IsEmptyOrNull {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        if("null".equals(str))
        {
            str=null;
        }

        if(str==null || str.isEmpty() )
        {
            System.out.println("Empty String Or Storing null !!!");
        }
        else
        {
            System.out.println("String Stores : "+ str);
        }
        sc.close();
    }
}
