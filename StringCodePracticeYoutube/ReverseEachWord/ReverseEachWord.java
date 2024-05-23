package ReverseEachWord;
import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence : ");
        String str = sc.nextLine();

        //Approach-01
        String[] strArr = str.split(" ");

        for(int i=0;i<strArr.length;i++)
        {
           String str1 = strArr[i];
            System.out.print(new StringBuilder(str1).reverse()+" ");   
        }

    }
}
