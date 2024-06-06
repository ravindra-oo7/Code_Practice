package Java8Codes.O12CountCharacters;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharactersInString {
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
            charMap.put(ch,charMap.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character,Integer> entry:charMap.entrySet())
        {
            System.out.println("Character : "+entry.getKey()+" | Count : "+entry.getValue());
        }
*/

/* 
        //Approach-02
        str.chars()
            .mapToObj(c->(char)c)
            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
            .entrySet().stream()
            .forEach(entry->System.out.println("Character : "+entry.getKey()+", Count : "+entry.getValue()));

*/

/* 
        //Approach-03 Print only duplicate characters
        str.chars()
        .mapToObj(c->(char)c)
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        .entrySet().stream().filter(entry->entry.getValue()>1)
        .forEach(entry->System.out.println("Character : "+entry.getKey()+", Count : "+entry.getValue()));
 */

 
    }
}
