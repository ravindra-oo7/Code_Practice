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

/* 
        //Aproach-02
        StringBuilder strBD = new StringBuilder();
        strOrignal.chars()
                    .distinct()
                    .forEach(c->{
                        strBD.append((char)c);
                    });

        System.out.println(strBD);
 */

/* 
        //Aproach-03
        StringBuilder strBD = new StringBuilder();

        for(int i=0;i<strOrignal.length();i++)
        {
            char ch =strOrignal.charAt(i);
            int idx = strOrignal.indexOf(ch, i+1);
            if(idx==-1)
            {
                strBD.append(ch);
            }
        }
        System.out.println(strBD);
 */

/* 
        //Approach-04
        char [] charArray = strOrignal.toCharArray();
        StringBuilder strBD = new StringBuilder();

        for(int i=0;i<charArray.length;i++)
        { 
            boolean repeated = false;
            for(int j=i+1;j<charArray.length;j++)
            {
                if(charArray[i]==charArray[j])
                {
                    repeated=true;
                    break;
                }
            }

            if(!repeated){
                strBD.append(charArray[i]);
            }           
        }
        System.out.print(strBD);
 */

        //Approach-05
        StringBuilder strBD = new StringBuilder();
        for(int i=0;i<strOrignal.length();i++)
        {
            if(!strBD.toString().contains(Character.toString(strOrignal.charAt(i))))
            {
                strBD.append(strOrignal.charAt(i));
            }
            
        }
        System.out.println("Final String : "+strBD);
 
    }
}
