package Java8Codes.O11ConvertListToMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CharacterCounter {
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
            char ch = str.charAt(i);
            charMap.put(ch , charMap.getOrDefault(ch,0)+1);
        }

        for (Map.Entry<Character,Integer> entry: charMap.entrySet()) 
        {
            System.out.println("Character : "+entry.getKey() +"| Occurance : "+entry.getValue() );
        }
*/
        //Approach-02
        Map<Character,Long> charMap = str.chars()
                                            .mapToObj(c->(char)c)
                                            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("Character Counts : ");
        charMap.forEach((character,count)->System.out.println("Characater : "+character +" | Count : "+count));
    }
}
