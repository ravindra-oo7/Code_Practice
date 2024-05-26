package StringCodes.O10NumberOfWordsCounter;

import java.util.Scanner;

public class NumberOfWordsCounter {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        String[] strArr = str.split(" ");

        System.out.println("Words in Sentence : "+ strArr.length);
        
    }
}
