import java.util.Scanner;

public class FibonaciBetweenTwoNumbs {
    static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {
        
        System.out.print("Enter 1st numb : ");
        int num1 = sc.nextInt();  

        System.out.print("Enter last numb : ");
        int num2 =  sc.nextInt();

        fibonaciSeries(num1,num2);

    }



    private static void fibonaciSeries(int num1, int num2) {
        int i=0;
        int j=1;
        int count=2;
        int temp;
        do {
            temp = i+j;
            i=j;
            j=temp;
            if(i>=num1){
                System.out.print(" " + i);
            }

        } while (temp<=num2);

    }
}
