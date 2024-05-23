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

/* 
        //Approach-01
        //Using Collections
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
*/

/* 
        //Approach-02
        //Without Using Collection
        StringBuilder strBD1 = new StringBuilder();
        StringBuilder strBD2 = new StringBuilder();


        for(int i=0;i<str.length();i++)
        {
            String str1 = Character.toString(str.charAt(i));

            if(!(strBD1.toString().contains(str1)))
            {
                strBD1.append(str1);
            }
            else
            {
                strBD2.append(str1);
            }
        }
        System.out.println("strBD1 : "+strBD1);
        System.out.println("strBD2 : "+strBD2);
        
        for(int i=0;i<strBD1.length();i++)
        {
            for(int j=0;j<strBD2.length();j++)
            {
                String str2 = Character.toString(strBD1.charAt(i));

               if(!(strBD2.toString().contains(str2)))
               {                   
                   System.out.println("First Non Repeating Character : "+strBD1.charAt(i));
                   System.exit(0);
               }
            }
        }
 */

/* 
        //Approach-03
        for(int i=0;i<str.length();i++)
        {
            boolean unique=true;
            for(int j=0;j<str.length();j++)
            {
                if(i!=j && str.charAt(i)==str.charAt(j))
                {
                    unique = false;
                }
            }
            if(unique)
            {
                System.out.println("First Non Repeating Character : "+str.charAt(i));
                break;
            }
        } 
*/

        //Approach-04
        LinkedHashMap<Character,Integer> strMap = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(strMap.containsKey(ch))
            {
                strMap.put(ch,strMap.get(ch)+1);
            }
            else
            {
                strMap.put(ch,1);
            }
        }
        System.out.println(strMap);

        for(HashMap.Entry<Character,Integer> entrySet:strMap.entrySet())
        {
            if(entrySet.getValue()==1)
            {
                System.out.println(entrySet.getKey());
                System.exit(0);
            }
        }


    }
}
