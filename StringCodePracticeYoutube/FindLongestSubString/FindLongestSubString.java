package FindLongestSubString;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FindLongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();

        StringBuilder strArrBD = new StringBuilder();
        StringBuilder strTemp = new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                if(!strTemp.toString().contains(Character.toString(str.charAt(j))))
                {
                     strTemp.append(str.charAt(j));
                }
                else
                {
                  strArrBD.append(strTemp+" ");
                  strTemp.delete(0, strTemp.length());
                  break;
                }
            }
            System.out.println(strArrBD);

        }
        String[] strArray = strArrBD.toString().split(" ");
        int pointer =0;
        int maxLength = 0;

        for (int i=0; i<strArray.length;i++) 
        {
            String string = strArray[i];
            if(string.length()>maxLength)
            {
                maxLength = string.length();
                pointer = i;
            }
        }

        System.out.println("Longest String : "+strArray[pointer]);

    }
}
