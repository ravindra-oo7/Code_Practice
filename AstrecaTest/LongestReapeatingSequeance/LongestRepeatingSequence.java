package LongestReapeatingSequeance;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestRepeatingSequence {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String str = sc.next();
        System.out.println("Entered String : "+ str);

        HashMap<Integer,Character> map1 = new HashMap<>(); 

        for(int i=0;i<str.length();i++)
        {
            Character ch = str.charAt(i);
            for(char j='A';j<='z';j++)
            {
                if(ch==j) {
                    map1.put(i, ch);
                }
            }
        }
        
        // map1.forEach((key,value)->{
            //    System.out.print(" key : "+key);
            //    System.out.println(" value : "+value); 
            // });
        for (Map.Entry<Integer,Character> entry : map1.entrySet()) 
        {
             System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // for(char i='A'; i<= 'Z';i++){
        //     System.out.println("ASCII value of "+i+" is :" + (int)i);
        // }
        // System.out.println("\n\n");
        // for(char i='a'; i<= 'z';i++){
        //     System.out.println("ASCII value of "+i+" is :" + (int)i);
        // }

    }
}
