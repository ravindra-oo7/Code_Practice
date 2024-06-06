package Java8Codes.O13FindFirstReapeatedCharacter;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstReapetedChar {
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter String : ");
         String str = sc.next().toLowerCase();
 
/*          
        //Approach-01
        Set<Character> charSet = new LinkedHashSet<>();
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(!charSet.add(ch))
            {
                System.out.println("First Repeated character : "+ch);
                break;
            }
            
        }
*/

        //Approach-02
        Character result = str.chars()
                                .mapToObj(c->(char)c)
                                .collect(Collectors.toMap(Function.identity(),v->1,Integer::sum,LinkedHashMap::new))
                                .entrySet()
                                .stream()
                                .filter(entry->entry.getValue()>1)
                                .map(Map.Entry::getKey)
                                .findFirst()
                                .orElse(null);

        if(result!= null)
        {
            System.out.println("First repeated character : "+ result);
        }
        else
        {
            System.out.println("No repeated chracters Found!!!");
        }


    }
}
