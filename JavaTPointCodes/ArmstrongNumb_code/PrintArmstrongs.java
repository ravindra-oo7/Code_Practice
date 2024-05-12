import java.util.Scanner;

public class PrintArmstrongs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Print Armstrongs numbers .");
        System.out.print("Enter Limit : ");
        Integer limit = sc.nextInt();
        
        for(int i =1;i<=limit;i++){
            if(isArmstrongNumb(i))
            {
                System.out.print(i +" ");
            }
        }
        
    }
    public static boolean isArmstrongNumb(Integer numb1)
    {
        Integer numb2 = numb1;
        Integer sum = 0;
        double length = numb1.toString().length() ;
        do {
            int lastDecimal = numb2%10;
            Double power = Math.pow(lastDecimal, length) ;

            sum = sum + power.intValue();

            numb2 = numb2/10;
        } while (numb2>0);
        
        if (numb1.equals(sum)) {
            return true;
        } else {
            return false;
        }
    }
}



/* 
import java.util.Scanner;
import java.lang.Math;

public class ArmstsrongNumberExample {

    static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        if (n == sum)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        num = sc.nextInt();

        System.out.println("Armstrong Number up to " + num + " are: ");
        for (int i = 0; i <= num; i++)
        {
            if (isArmstrong(i))
            {
                System.out.print(i + ", ");
            }    
        }        
    }
}
 */

