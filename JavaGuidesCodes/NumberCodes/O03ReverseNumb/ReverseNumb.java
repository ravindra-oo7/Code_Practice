package NumberCodes.O03ReverseNumb;

import java.util.Scanner;

public class ReverseNumb {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numb : ");
        int numb = sc.nextInt();

/*         
        //Approach-01
        int reverseNumb = 0;
        while(numb!=0)
        {
            int lastnumb = numb%10;
            reverseNumb=(reverseNumb*10)+lastnumb;
            numb = numb/10;
        }    
        System.out.println("Reverse Number : "+reverseNumb );
*/
        //Approach-02
        StringBuilder str = new StringBuilder(String.valueOf(numb));
        str.reverse();
        Integer revrseInt = Integer.parseInt(str.toString());
        System.out.println("Reverse Number : "+revrseInt);

    }
}
