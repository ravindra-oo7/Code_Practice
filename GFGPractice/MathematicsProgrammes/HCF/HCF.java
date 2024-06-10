package MathematicsProgrammes.HCF;
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int numb1 = sc.nextInt();  
        System.out.print("Enter Second Number : ");
        int numb2 = sc.nextInt();   

/* 
        //Approach-01
        int lowestNumb = Math.min(numb1, numb2);
        int hcf = 1;
        for(int i=2;i<=lowestNumb;i++)
        {
            if(numb1%i == 0 && numb2%i == 0)
            {
                hcf=i;
            }
        }
        System.err.println("HCF : "+hcf);
*/
        //Approach-02
        int hcf = Math.min(numb1, numb2);
        while (hcf>0) 
        {
            if(numb1%hcf == 0 && numb2%hcf == 0)
            {
                break;
            }
            hcf--;
        }
        System.out.println("HCF : "+hcf);

    }
}
