package StringCodes.O03FindDuplicateCharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharsFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to Duplicate Characters in String : ");
        String str = sc.nextLine();

        Map<Character, Integer > strMap = new HashMap<>();


        for (char e : str.toCharArray()) {
            strMap.put(e, strMap.getOrDefault(e,0)+1);            
        }
        
        System.out.println("Duplicate Characters : ");
        for (Map.Entry<Character,Integer> entry :strMap.entrySet()) {
            if(entry.getValue()>1)
            {
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
