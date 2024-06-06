package Java8Codes.O13FindFirstReapeatedCharacter;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstReapetedChar {
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter String : ");
         String str = sc.next().toLowerCase();
         
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

    }
}
