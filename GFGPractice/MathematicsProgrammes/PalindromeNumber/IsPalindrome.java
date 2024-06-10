package MathematicsProgrammes.PalindromeNumber;
import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

/*         
        //Approach-01
        StringBuilder strBD = new StringBuilder(Integer.toString(numb));

        if(Integer.toString(numb).equals(strBD.toString()))
        {
            System.out.println("Entered Number is Palindrome ");
        }
        else
        {
            System.out.println("Not Palindrome!!");
        }
*/

        //Approach-02
        int temp = numb;
        int reversed = 0;
        while(temp!=0)
        {
            reversed = reversed*10+temp%10;
            temp/=10;
        }

        if(reversed==numb)
        {
            System.out.println(numb +" is Palindrome.");
        }
        else
        {
            System.out.println(numb+" is Not Palindrome!!");
        }


    }
}
