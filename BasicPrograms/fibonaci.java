import java.util.Scanner;

class fibonaci{

    public static void main(String args[]){

        int i=0;
        int j=1;
        int count=2;
        System.out.println("Enter number to Print Fibonaci series");
        Scanner sc = new Scanner(System.in);
        int numbs = sc.nextInt();
        System.out.print(i+" "+j+" ");
        do {
            int temp = i+j;
            i=j;
            j=temp;
            System.out.print(temp+ " ");
            count++;

        } while (count!=numbs);

    }
}