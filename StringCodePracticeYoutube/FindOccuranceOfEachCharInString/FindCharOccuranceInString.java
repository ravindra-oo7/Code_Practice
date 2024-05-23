package FindOccuranceOfEachCharInString;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FindCharOccuranceInString {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();

        //Approach-01
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
           if(map.containsKey(ch))
           {
                map.put(ch,map.get(ch)+1);
           }
           else
           {
               map.put(ch,1);
           }
        }
        for(HashMap.Entry<Character,Integer> entry :map.entrySet())
        {
            System.out.println("Char : "+entry.getKey()+" Occurance : "+entry.getValue());
        }

    }
}
