package RemoveDuplicateCharacter;
import java.util.*;
import java.lang.*;


public class RemoveRepeatedChar {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String strOrignal = sc.next();

/* 
        //Aproach-01
        HashSet<Character> charSet = new LinkedHashSet<>();
        
        for(int i=0;i<strOrignal.length();i++){
            charSet.add(strOrignal.charAt(i));            
        }

        for (Character character : charSet) 
        {
            System.out.print(character);    
        }
 */

        //Aproach-02
        StringBuilder strBD = new StringBuilder();
        strOrignal.chars()
                    .distinct()
                    .forEach(c->{
                        strBD.append((char)c);
                    });

        System.out.println(strBD);

    }
}
