import java.util.Scanner;

public class PrimeNumbBetween {

    public static void findPrime(int num1, int num2) {
        if(num1==2){
            System.out.print(num1 +" ");
        }

        if (num1 > 1) {
            for (int i=num1; i<=num2; i++) {
                boolean isPrime = true;

                int count=2;
                do {
                    if (i % count == 0) {

                        isPrime=false;
                        break;
                    } else {
                        count++;
                    }
                } while (count<=Math.sqrt(i));

                if(isPrime){
                    System.out.print(i +" ");
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Enter Two number to find Prime number between them");

        do {
            System.out.println("Smaller Limit Should be greater than 1 !! ");
            System.out.println();
            System.out.print("Enter smaller limit : ");
            num1 = sc.nextInt();
        } while (num1 <2);

        System.out.print("Enter Larger Limit : ");
        num2 = sc.nextInt();

        findPrime(num1, num2);

    }

}
