package NumberCodes.O16SwapTwoNumbs;

import java.util.Scanner;

public class SwapNumbs {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter  first Number : ");
        int numb1 = sc.nextInt();
        System.out.print("Enter  second Number : ");
        int numb2 = sc.nextInt();
/* 
        //Approach-01
        int temp = numb1;
        numb1=numb2;
        numb2=temp;
        System.out.println("After Swapping ");
        System.out.println("Numb1 : "+numb1+" | Numb2 : "+numb2);
 */


        //Approach-02 without temp variable
        numb1 = numb1+numb2;
        numb2=numb1-numb2;
        numb1=numb1-numb2;
        System.out.println("After Swapping ");
        System.out.println("Numb1 : "+numb1+" | Numb2 : "+numb2);

    }
}
