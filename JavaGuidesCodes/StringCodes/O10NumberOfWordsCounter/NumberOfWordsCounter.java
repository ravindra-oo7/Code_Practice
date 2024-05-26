package StringCodes.O10NumberOfWordsCounter;

import java.util.Scanner;

public class NumberOfWordsCounter {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

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
    }
}
