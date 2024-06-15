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

/*         
        //Approach-01
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
        //    if(map.containsKey(ch))
        //    {
        //         map.put(ch,map.get(ch)+1);
        //    }
        //    else
        //    {
        //        map.put(ch,1);
        //    }
            map.put(ch,map.getOrDefault(ch, 0)+1);

        }
        for(HashMap.Entry<Character,Integer> entry :map.entrySet())
        {
            System.out.println("Char : "+entry.getKey()+" Occurance : "+entry.getValue());
        }

*/        
        //Approach-02 Incomplete
        int[] arr = new int[str.length()];
       // char[] charArr = new char[str.length()];
        StringBuilder strBD = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            int count=1;
            char ch = str.charAt(i);
            if(!strBD.toString().contains(Character.toString(ch)))
            {
                for(int j=i+1;j<str.length();j++)
                {
                    if(ch==str.charAt(j))
                    {
                        count++;
                    }
                }
                strBD.append(ch);
            }    

            arr[i]=count;
           // charArr[i] = ch;
        }

        for(int i=0;i<strBD.length();i++)
        {
            System.out.println("Char : "+strBD.charAt(i)+" | Count : "+arr[i]);
        }


    }
}
