package ReverseEachWord;
import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence : ");
        String str = sc.nextLine();

        String[] strArr = str.split(" ");
 /*        
        //Approach-01
        for(int i=0;i<strArr.length;i++)
        {
           String str1 = strArr[i];
            System.out.print(new StringBuilder(str1).reverse()+" ");   
        }
 */
        //Approach-02
        for(int i=0;i<strArr.length;i++)
        {
            String str1 = strArr[i];
            for(int j=str1.length()-1;j>=0;j--)
            {
                System.out.print(str1.charAt(j));
            }
            System.out.print(" ");

        }


    }
}
