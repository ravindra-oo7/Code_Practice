package StringCodes.O24AddCharacterToString;

import java.util.Scanner;

public class AddCharacterToString {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String1 : ");
        String str = sc.next();

        System.out.print("Enter Character : ");
        char ch = sc.next().charAt(0);

        System.out.print("Enter Position of insertion : ");
        int position = sc.nextInt();

        StringBuilder strBD = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(position==i+1)
            {
                strBD.append(ch);
            }
            strBD.append(str.charAt(i));
        }
         
        System.out.println(strBD);
    }
}
