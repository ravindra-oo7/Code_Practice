package Java8Codes.O01CharacterOccurancesInString;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next().toLowerCase();

        //Approach-01
        Map<Character,Integer> charMap = new LinkedHashMap<>();

        for(int i=0;i<str.length();i++)
        {
            Character ch = str.charAt(i); 
            charMap.put(ch, charMap.getOrDefault(ch,0)+1);
        }

        for (Map.Entry<Character,Integer> entry: charMap.entrySet()) 
        {
            System.out.println("Character : "+entry.getKey()+"| Occurances : "+entry.getValue());
        }

    }
}