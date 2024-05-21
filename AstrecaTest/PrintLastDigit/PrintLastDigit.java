package PrintLastDigit;
import java.util.Scanner;

public class PrintLastDigit {

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in); 
    //     System.out.print("Enter any natural number : ");
    //     int numb1 = sc.nextInt();

    //     while (numb1>9) {
    //         numb1=numb1%10;
    //     }
    //     System.out.println("Last Digit is "+ numb1);

    // }

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter any natural number : ");
        String numb1 = sc.next();
        Integer temp = Integer.valueOf(numb1);

        while (temp>9) {
            temp%=10;
        }
        System.out.println("Last Digit is "+ temp);

    }


}
