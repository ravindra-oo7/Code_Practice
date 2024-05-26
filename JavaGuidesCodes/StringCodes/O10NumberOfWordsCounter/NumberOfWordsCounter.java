package StringCodes.O10NumberOfWordsCounter;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfWordsCounter {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();//.trim();//trim() method remove leading and trailing spaces

/* 
       // String[] strArr = str.split("\\s");
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

// Above two Approaches will not work if give extra spaces between words.
// it will count extra spaces as  words
//Hence we will not use above approach

/* 
        //Approach-03 Using String Tokeniser
        StringTokenizer tokenizer = new StringTokenizer(str);

        int wordCount = tokenizer.countTokens();

        System.out.println("Number of Words : "+wordCount);
 */

/*  
        //Approach-03
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(str);

        int wordCount = 0;
        while(matcher.find())
        {
            wordCount++;
        }

        System.out.println("Number of words : "+ wordCount);
 */



    }
}
