package StringCodes.O07CharacterOccuranceCounter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccuranceCounter {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();

/* 
        //Approach-01
        char[] chArr = str.toCharArray(); 
        Map<Character, Integer> chMap = new LinkedHashMap<>();

        for (char c : chArr) 
        {
            chMap.put(c, chMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character,Integer> entry:chMap.entrySet())
        {
            System.err.println("Character : " + entry.getKey()+ " | Occurance : "+ entry.getValue());
        }
*/
        
        //Approach-02 Without using Collection
        StringBuilder strBD = new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
        
            if(!strBD.toString().contains(Character.toString(str.charAt(i))))
            {
                strBD.append(str.charAt(i));
                int counter = 0;
                for(int j=i;j<str.length();j++)
                {
                    if(str.charAt(i)==str.charAt(j))
                    {
                        counter++;
                    }
                }
                System.out.println("Character : "+ str.charAt(i)+ " | Occurance : "+counter);

            }
        } 

    }
}
