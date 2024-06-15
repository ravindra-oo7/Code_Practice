package ReplaceCharacterWithItsOccurance;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ReplaceCharWithItsOccurance {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String strOrignal = sc.next();
        System.out.print("Enter character to replace : ");
        char ch = sc.next().charAt(0);

        //Check if char is present in String
        if(strOrignal.indexOf(ch)==-1)
        {
            System.out.println("Entered Character is Not Present in Input String!!");
            System.exit(0);
        }

        /*         
        //Approach-01
        char [] charArray = strOrignal.toCharArray();    

        Map<Character,Integer> strMap= new LinkedHashMap<>();

        for(int i=0;i<charArray.length;i++)
        {
            strMap.put(charArray[i],strMap.getOrDefault(charArray[i],1));
        }

        int counter = 1;
        for(int i=0;i<charArray.length;i++)
        {
            if (charArray[i]==ch)
            {
                System.out.print(counter);
                strMap.put(ch, strMap.get(ch)-1);
                counter++;
            }
            else{
                System.out.print(charArray[i]);
            }
        }
  */      

/* 
        //Approach-02

        //Logic to replace char occurance in string
        char[] charArray = strOrignal.toCharArray();
        int count = 1;
        for(int i=0;i<charArray.length;i++)
        {
            if(charArray[i]==ch)
            {
                charArray[i]=String.valueOf(count).charAt(0);
                count++;
            }
        }      
        System.out.println(Arrays.toString(charArray));
 */

/*  
        //Approach-03
        int count = 1;
        for(int i=0;i<strOrignal.length();i++)
        {
           char crrChar = strOrignal.charAt(i);
           if(crrChar==ch)
            {
               strOrignal = strOrignal.replaceFirst(String.valueOf(crrChar),String.valueOf(count));
                count++;
            }
        }
        System.out.println(strOrignal);
*/
        // Approach-04
        int counter = 0;
        for(int i=0;i<strOrignal.length();i++)
        {
            char currCh = strOrignal.charAt(i);
            if(currCh==ch)
            {
                counter++;
            }
        } 
        System.out.println(ch+" : "+counter);

        for(int i=strOrignal.length()-1;i>=0;i--)
        {
            char currCh = strOrignal.charAt(i);
            if(currCh==ch)
            {
               // strOrignal.replaceFirst(Character.toString(currCh), Integer.toString(counter));
               strOrignal = strOrignal.substring(0, i) + counter + strOrignal.substring(i + 1);
               counter--;
            }
        }
        System.out.println("Final String : "+strOrignal);

    }
}
