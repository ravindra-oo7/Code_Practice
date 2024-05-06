import java.util.Scanner;

public class StarPattern1 {

/*     
//Left Triangular Pattern

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 */
//------------------------------------------------------------------------------------------------

//Right Triangular Pattern


     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num : ");
        int num = sc.nextInt();

        int count=0;

        for(int i=0;i<num;i++)
        {
            for(int j=num-i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    
    


}
