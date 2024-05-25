package StringCodes.O09CountNumberOfDuplicateWords;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWordsCounter {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence : ");
        String str = sc.nextLine();

        String[] strArr = str.split(" ");
        Map<String,Integer> strMap = new LinkedHashMap<>();

        for (String string : strArr) 
        {
            String stringLowerCase = string.toLowerCase();
            strMap.put(stringLowerCase, strMap.getOrDefault(stringLowerCase, 0)+1); 
        }
        int counter =0;
        for(Map.Entry<String,Integer> entry :strMap.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.err.println("Word : "+ entry.getKey()+" | Occurance : "+entry.getValue());
                counter++;
            }
        }
        
        System.out.println("Total Duplcate words : "+ counter );


    }
}
