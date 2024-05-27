package StringCodes.O14RemoveDuplicateWords;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWordsRemover {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String strInput = sc.nextLine();

        //Approach-01
        Set<String> strSet = new LinkedHashSet<>();

        String [] strArr = strInput.split("\\s");

        for (String string : strArr) 
        {
            strSet.add(string.toLowerCase());
        }

        for (String string : strSet) 
        {
            System.out.print(string+" ");
        }
    }
}
