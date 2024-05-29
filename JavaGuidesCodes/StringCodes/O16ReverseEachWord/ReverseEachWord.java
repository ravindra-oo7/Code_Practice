package StringCodes.O16ReverseEachWord;
import java.util.Scanner;


public class ReverseEachWord {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        String [] strArr = str.trim().split("\\s+");

        //Approach-01
        for (String string : strArr) 
        {
            StringBuilder strBD = new StringBuilder(string);
            System.out.print(strBD.reverse()+" ");
        }

        
    }
}
