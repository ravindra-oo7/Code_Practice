import java.util.Scanner;

public class PrimeNumbCorrected {

    public static void isPrime(int num) {
        boolean flag = true;
        if (num > 1) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                    System.out.println("Not a Prime Number");
                    break;
                }
            }
        } else {
            flag = false;
            System.out.println("Prime Number starts from 2");
        }

        if (flag) {
            System.out.println("Prime Number !!!");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter Number to check if it is Prime: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        if (num1 < 2) {
            System.out.println("Prime Number starts from 2");
        } else {
            isPrime(num1);
        }
        System.out.println(Math.sqrt(3));
    }


}
