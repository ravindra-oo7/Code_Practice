import java.util.Scanner;

public class CharacterPattern {
    
//Pattern 01
/* 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int rows=sc.nextInt();

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
        }
    }

*/
//---------------------------------------------------------------------------------------
//Pattern 02

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int rows=sc.nextInt();
        int count=65;
    
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(count)+" ");
            }
            count++;
            System.out.println();
        }

    } 

//---------------------------------------------------------------------------------------


}
