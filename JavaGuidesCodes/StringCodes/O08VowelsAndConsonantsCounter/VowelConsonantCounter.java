package StringCodes.O08VowelsAndConsonantsCounter;
import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();

        //Approach-01
        int vowels = 0;
        int consonants = 0;
        String vowStr = "AEIOUaeiou";

        for(int i=0;i<str.length();i++)
        {
            if(vowStr.contains(Character.toString(str.charAt(i))))
            {
                vowels++;
            }
            else
            {
                consonants++;
            }
        }

        System.err.println("Vowels : "+vowels);
        System.err.println("Consonants : "+consonants);
    }
}
