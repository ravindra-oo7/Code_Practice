package StringCodes.O06CountOccurrencesOfWords;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurancesOfWords {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String str = sc.nextLine();

        String[] strArr = str.split(" ");

        Map<String, Integer> strMap = new LinkedHashMap<>();
        
        for (String string : strArr) 
        {
            String stringlowerCase = string.toLowerCase();
            strMap.put(stringlowerCase, strMap.getOrDefault(stringlowerCase, 0)+1);
        }

         for(Map.Entry<String,Integer> entry:strMap.entrySet())
            {
                // if(entry.getValue()>1)
                // {
                //     System.out.println("Word : "+ entry.getKey()+ "  |  Occurance : "+ entry.getValue());
                // }
                System.out.println("Word : "+ entry.getKey()+ "  |  Occurance : "+ entry.getValue());
            }
    }
}
