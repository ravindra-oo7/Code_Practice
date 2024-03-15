import java.util.Scanner;

public class IsArmstrongNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check if it is ArmstrongNumb or not.");
        Integer numb1 = sc.nextInt();

        if (isArmstrong(numb1)) {
            System.out.println("It is an Armstrong number!!!");
        } 
        else 
        {
            System.out.println("Not an Armstrong number!!!");

        }

    }

    private static boolean isArmstrong(Integer numb1) {
        Integer sum = 0;
        Integer length = numb1.toString().length();
        Integer numb2 = numb1;

        do {
            Integer temp = numb2 % 10;
            Double power = Math.pow(temp, length);
            sum = sum + (Integer) power.intValue();
            numb2 = numb2 / 10;
        } while (numb2 > 0);

        System.out.println(sum +" "+numb1);
        if (sum.equals(numb1)) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
}
