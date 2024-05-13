import java.util.Scanner;
import java.util.Stack;

public class StringWordsReversal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        stringReversal(str);
        
    }

    private static void stringReversal(String str) 
    {
        String[] arrayOfWords = str.split(" "); 

        Stack<String> stackOfWords = new Stack<>();

        for (String e : arrayOfWords) 
        {
            stackOfWords.push(e);            
        }
        for (int i=0;i<arrayOfWords.length;i++ ) 
        {
            String words= stackOfWords.pop();
            System.out.print(words+" ");
        }

    }
}
