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
/* 
    //Approach-01
        Set<String> strSet = new LinkedHashSet<>();
        //String [] strArr = strInput.split("\\s");
        String [] strArr = strInput.trim().split("\\s+");

        for (String string : strArr) 
        {
            strSet.add(string.toLowerCase());
        }

        for (String string : strSet) 
        {
            System.out.print(string+" ");
        }

        ////Check Set Entries
        // System.out.println(strSet.size());
        // for (String string : strSet) 
        // {
        //     System.out.println("Set Entry :"+string);
        // }
 */

    //Approach-02
        String [] words = strInput.trim().split("\\s+");

        Set<String> wordsSet = new LinkedHashSet<>();

        StringBuilder strBD = new StringBuilder();

        for(String word:words)
        {
            if(wordsSet.add(word.toLowerCase()))
            {
                strBD.append(word).append(" ");
            }
        }
        String result = strBD.toString();
        System.out.println(result);
    }
}
 