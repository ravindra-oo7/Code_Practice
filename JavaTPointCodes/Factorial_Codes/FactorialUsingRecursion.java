import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {

        System.out.println("Enter numb to find Factorial :-");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int factorialAns = factorial(num);
        System.out.println("Factorial of " + num + " is " + factorialAns);
        sc.close();
    }

    private static int factorial(int num) {
        // int fact = num;
        if (num == 0 || num == 1) {
            return 1;
        } else {

          //  return num * factorial(num--); //NOT OK  will pass num, then decrement num by 1
          //  return num * factorial(--num); //OK Decrement num and pass it as argument
            return num * factorial(num-1);
        }
    }
}
