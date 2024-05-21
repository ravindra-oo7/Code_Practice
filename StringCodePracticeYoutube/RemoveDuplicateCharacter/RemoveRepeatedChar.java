package RemoveDuplicateCharacter;
import java.util.*;
import java.lang.*;


public class RemoveRepeatedChar {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String strOrignal = sc.next();

        //Approach-01
        HashSet<Character> charSet = new LinkedHashSet<>();
        
        for(int i=0;i<strOrignal.length();i++){
            charSet.add(strOrignal.charAt(i));            
        }

        for (Character character : charSet) 
        {
            System.out.print(character);    
        }

    }
}
