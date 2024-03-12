import java.util.Scanner;

public class PalindromeNumb {
    public static void main(String[] args) {
        System.out.print("Enter Number to Check if it is Palindrome or Not : ");
        Scanner sc = new Scanner(System.in);
        Integer num1 = sc.nextInt();

        if (isPalindrome(num1)) {
            System.out.println(num1 + " is a Palindrome number");

        } else {
            System.out.println(num1 + " is not a Palindrome !!!");
        }

    }

    private static boolean isPalindrome(Integer num1) {

        int orignalNum = num1;
        int reversedNum = 0;

        while (num1 > 0) {
            int lastDigit = num1 % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num1 = num1 / 10;
        }

        if (orignalNum == reversedNum) {
            return true;
        } else {
            return false;
        }
    }
}
