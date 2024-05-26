package StringCodes.O10NumberOfWordsCounter;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberOfWordsCounter {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();//.trim();//trim() method remove leading and trailing spaces

/* 
        String[] strArr = str.split(" ");

        //Approach-01
        System.out.println("Words in Sentence : "+ strArr.length);
        
        //Approach-02
        int counter=0;
        for(int i=0;i<strArr.length;i++)
        {
            System.out.println(strArr[i]);
            counter++;
        }
        System.out.println(counter);
 */
        //Approach-03 Using String Tokeniser
        StringTokenizer tokenizer = new StringTokenizer(str);

        int wordCount = tokenizer.countTokens();

        System.out.println("Number of Words : "+wordCount);


    }
}
