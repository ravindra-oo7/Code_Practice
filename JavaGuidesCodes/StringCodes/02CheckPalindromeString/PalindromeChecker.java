import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String to check if Palindrome : ");
        String str=sc.nextLine();
        
        if(isPalindrome(str))
        {
            System.out.println("/ "+str +" / is Palindrome!");
        }else
        {
            System.err.println("/ "+str + " / is not Palindrome! ");
        }

    }

    private static boolean isPalindrome(String str) {
       //Step 1: Convert the String to lowercase
       String cleanString = str.toLowerCase(); 

       //Step 2: Reverse the String
       String reversed = new StringBuilder(cleanString).reverse().toString();

        //Step 3: Compare the orignal with the reversed String
        return cleanString.equals(reversed);
    }
    
}
