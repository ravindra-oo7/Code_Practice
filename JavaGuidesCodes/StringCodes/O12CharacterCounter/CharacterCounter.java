package StringCodes.O12CharacterCounter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str =  sc.next();
        
        //Approach-01
        //Using Collection
        Map<Character,Integer> charMap = new LinkedHashMap<>();
        char[] charArr = str.toCharArray();

        for (char c : charArr) 
        {
            charMap.put(c, charMap.getOrDefault(c,0)+1);
        }

        System.out.println(charMap);
    }
}
