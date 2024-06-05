package Java8Codes.O11ConvertListToMap;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ConvertListToMap {
    public static void main(String[] args) 
    {
        List<String> items = List.of("apple", "banana", "cherry");


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


        
    }
}
