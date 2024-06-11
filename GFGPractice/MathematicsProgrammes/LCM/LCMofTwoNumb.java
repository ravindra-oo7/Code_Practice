package MathematicsProgrammes.LCM;
import java.util.Scanner;

public class LCMofTwoNumb {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int numb1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int numb2 = sc.nextInt();

        //Approch-01
        int max = Math.max(numb1, numb2);
        int min = Math.min(numb1, numb2);
        int lcm = max;
        int counter =1;

        for(int i=min;i<=min*max;i++)
        {
            if(lcm%min==0)
            {
                
                break;
            }
            else
            {
                lcm = max*(counter);
                counter++;
            }
        }
        System.out.println("LCM : "+lcm);


    }
}
