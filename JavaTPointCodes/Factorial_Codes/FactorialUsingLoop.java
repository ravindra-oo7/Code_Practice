import java.util.Scanner;

public class FactorialUsingLoop {

    public static void main(String[] args) {
        System.out.println("Enter numb to find Factorial :-");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        FactorialUsingLoop obj = new FactorialUsingLoop();
        obj.factorial(num);
        sc.close();
    }

    private  void factorial(int num) {
        int fact=1;
        for(int i=num;i>0;i--){
            fact*=i;

        }
        System.out.println("Factorial of "+num+ " is "+fact);
    }

}