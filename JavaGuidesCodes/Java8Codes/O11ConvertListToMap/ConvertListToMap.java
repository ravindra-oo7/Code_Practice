package Java8Codes.O11ConvertListToMap;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args) 
    {
        List<String> items = List.of("apple", "banana", "cherry");

/* 
        //Approach-01
        Map<String,Integer> strMap = new LinkedHashMap<>();

        for (String string : items) 
        {
            strMap.put(string, string.length());   
        }

        for (Map.Entry<String,Integer> entry: strMap.entrySet()) 
        {
            System.out.println("Key : "+entry.getKey()+" | Value : "+entry.getValue());
        }
*/

        //Approach-02
       Map<String,Integer> strMap =  items.stream()
                                            .collect(Collectors.toMap(item->item, item->item.length()));

        System.out.println("List to Map : ");
        strMap.forEach((key,value)->System.out.println("Key : "+key+ " | Value : "+value));

    }
}
