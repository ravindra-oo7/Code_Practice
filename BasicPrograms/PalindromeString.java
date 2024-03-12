import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Enter The String to check if it is palindrome.");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(isString(str)){
            System.out.println(str + " is a Palindrome String !!!");
        }else{
            System.out.println("Not a Palindrome");
        }
    }

        static boolean isString(String str) {

            String orignalStr = str;
            String reversedStr = new String();

            for(int i=orignalStr.length()-1;i>=0;i--){

                reversedStr=reversedStr+orignalStr.charAt(i);
            }

            return orignalStr.equals(reversedStr);

    }
}
