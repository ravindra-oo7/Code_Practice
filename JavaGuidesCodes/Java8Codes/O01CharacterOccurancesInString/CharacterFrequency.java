package Java8Codes.O01CharacterOccurancesInString;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next().toLowerCase();
/* 
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
 */

        //Approach-02 using streamAPI
        str.chars()
            .mapToObj(c->(char)c)
            .collect(Collectors.groupingBy(c->c,Collectors.counting()))
            .forEach((character,frequency)->System.out.println(character+": "+frequency));



    }
}