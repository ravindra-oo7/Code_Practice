package StringCodes.O23MaximumOccurringCharacter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumOccurringCharacter {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next().trim();

/* 
        //Approach-01 Using HashMap

        Map<Character,Integer> charMap = new LinkedHashMap<>();

        for(int i=0;i<str.length();i++)
        {
            charMap.put(str.charAt(i),charMap.getOrDefault(str.charAt(i), 0)+1);
        }

        int highestValue=0;
        Character finalCh=null; 
        for(Map.Entry<Character,Integer> entry:charMap.entrySet())
        {
            int entryValue = entry.getValue();

            if(entryValue>highestValue)
            {
                highestValue =entryValue;
                finalCh = entry.getKey();
            }
        }

        System.err.println("Character [ "+finalCh+" ] has Highest Occurances :"+highestValue);
 */
        //Approach-02
        int highOccurance = 0;
        char highChar=' ';

        for(int i=0;i<str.length();i++)
        {
            int counter = 0;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    counter++;
                }
            }

            if(counter>highOccurance)
            {
                highOccurance=counter;
                highChar = str.charAt(i);
            }
        }

        System.out.println("Highest Occurring Character is [ "+highChar+" ] Occured : "+highOccurance);

    }
}
