package StringCodes.O07CharacterOccuranceCounter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccuranceCounter {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();

        //Approach-01
        char[] chArr = str.toCharArray(); 
        Map<Character, Integer> chMap = new LinkedHashMap<>();

        for (char c : chArr) 
        {
            chMap.put(c, chMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character,Integer> entry:chMap.entrySet())
        {
            System.err.println("Character : " + entry.getKey()+ " | Occurance : "+ entry.getValue());
        }
    }
}
