package StringCodes.O01FindFirstNonRepeatedChars;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindFirstNonReapeatedChars {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter String as Input : ");
        String text= sc.nextLine();

        char result= firstNonReapeatedChar(text);

        if(result !='\0'){
            System.out.println("The first non-repeated character is: "+result);
        }else{
            System.out.println("All characters are reapeated.");
        }

    }
    public static char firstNonReapeatedChar(String inputText){
        //Step 1: character Counter
        Map<Character,Integer> charCount= new HashMap<>();

        //Step 2: Iterate String and put characters in map with its frequency 
        for (char ch : inputText.toCharArray()) 
        {
            charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
        }

        //Step 3: Find the First character with a count of 1
        for (char ch : inputText.toCharArray()) 
        {
            if(charCount.get(ch)==1)
            {
                return ch;
            }
        }
        return '\0';// return null char if all characters are repeated 
    }
    
}
