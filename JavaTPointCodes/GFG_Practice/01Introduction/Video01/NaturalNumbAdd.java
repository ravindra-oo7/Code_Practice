import java.util.Scanner;

public class NaturalNumbAdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to find Sum of N natural numbers : ");

        int num1 = sc.nextInt();

        System.err.println("Sum is : " + findSum(num1));
    }

    private static int findSum(int num1) {
        int total =0;
        for(int i=0;i<=num1;i++){
            total=total+i;

        }
        return total;

    }
}