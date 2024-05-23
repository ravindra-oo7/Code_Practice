package FindFirstNonReapeatedChar;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FindFirstNonRepeatedChar {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();


        //Approach-01
        HashMap<Character,Integer> strMap = new LinkedHashMap<>();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            strMap.put(ch, strMap.getOrDefault(ch,0)+1);
        }

        for(Character key:strMap.keySet())
        {
            if(strMap.get(key)==1)
            {
                System.out.println("First Non Repeating Character : "+key);
                System.exit(0);
            }
        }
        System.out.println("Non Repeating character Not found !!");

        // //Printing HashMap 
        // for (Character key : strMap.keySet()) 
        // {
        //     System.out.println("Key : "+key+" Value : "+strMap.get(key));            
        // }
 

    }
}
