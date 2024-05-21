package RemoveSpecialChars;
import java.util.Scanner;

public class RemoveSpeacialChars {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String strOrignal = sc.next();

        for(int i=0;i<strOrignal.length();i++)
        {
            if(
                (int)strOrignal.charAt(i)>=65 && (int)strOrignal.charAt(i)<=90 
            || 
                (int)strOrignal.charAt(i)>=97 && (int)strOrignal.charAt(i)<=122 
            )
                {
                    System.out.print(strOrignal.charAt(i));
                }
        }

    }
}
