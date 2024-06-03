package NumberCodes.O15PalindromeNumb;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter  Number : ");
        int numb = sc.nextInt();

/*         
        //Approch-01 using string and StringBuilder
        StringBuilder strBD = new StringBuilder();
        String strNumb = Integer.toString(numb);

        for(int i=strNumb.length()-1;i>=0;i--)
        {
            strBD.append(strNumb.charAt(i));
        }
        String reverseInt = strBD.toString();

        if(strNumb.equals(reverseInt))
        {
            System.out.println(numb+ " : Palindrome.");
        }
        else
        {
            System.out.println(numb+ " : Not Palindrome.");
        }
*/
        //Approach-02 
        int revrsedNumb = 0;
        int inputNumb = numb;
        while (inputNumb!=0)
        {
            int temp = inputNumb%10;
            revrsedNumb = (revrsedNumb*10)+temp;
            inputNumb/=10;
        }

        if(numb==revrsedNumb)
        {
            System.out.println(numb+" : Palindrome");
        }
        else
        {
            System.out.println(numb +" : Not Palindrome");
        }

    }

}
