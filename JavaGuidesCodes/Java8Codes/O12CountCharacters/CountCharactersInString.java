package Java8Codes.O12CountCharacters;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharactersInString {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next().toLowerCase();

        Map<Character,Integer> charMap = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            charMap.put(ch,charMap.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character,Integer> entry:charMap.entrySet())
        {
            System.out.println("Character : "+entry.getKey()+" | Count : "+entry.getValue());
        }

    }
}
