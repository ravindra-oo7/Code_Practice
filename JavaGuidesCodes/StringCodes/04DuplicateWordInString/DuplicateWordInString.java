import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWordInString {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter String : ");
        String sentence=sc.nextLine();
        System.out.print("Duplicate words in the String are : ");
        findDuplicateWords(sentence);
    }

    private static void findDuplicateWords(String str )
    {

        String[] words = str.split(" ");
        Map<String,Integer> wordCountMap = new HashMap<>();
        
        for (String word : words) 
        {

            String wordLowerCase = word.toLowerCase();
            wordCountMap.put(wordLowerCase,wordCountMap.getOrDefault(wordLowerCase, 0)+1);
        }

        for (Map.Entry<String,Integer>entry : wordCountMap.entrySet()) 
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey()+" : "+entry.getValue()+" Times");
            }
        }

    }    
}
