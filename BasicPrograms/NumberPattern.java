import java.util.Scanner;

public class NumberPattern {
   
//Pattern 01    
/*     
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }        
    }
 */
//-------------------------------------------------------------------

//Pattern 02   
/* 
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();
        int count=1;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(count +" ");
                count++;
            }
            System.out.println();
        } 

    }
 */

//------------------------------------------------------------------------

//Pattern 03
/* 
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();
        int count=1;
       

        for (int i = 0; i < rows; i++)   
        {  
            int number = 1;  
            //For spaces
            System.out.printf("%" + (rows - i) * 2 + "s", "");  

            for (int j = 0; j <= i; j++)   
            {  
                System.out.printf("%4d", number);  
                number = number * (i - j) / (j + 1);  
            }  
            System.out.println();  
        }  
    }
*/  

//------------------------------------------------------------------------

//Pattern 04

    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int num = sc.nextInt();
        int rows=(num*2)-1;

        for (int i = 1; i <= num; i++)  
        {  
            int n = rows;  
            for (int j = 1; j<= n - i; j++)   
            {   
                System.out.print(" ");   
            } 

            for (int k = i; k >= 1; k--)  
            {  
                System.out.print(k);  
            }

            for (int l = 2; l <= i; l++)   
            {  
                System.out.print(l);   
            }   
            System.out.println();   
        }   
         
        for (int i = num-1; i >= 1; i--)  
        {  
            int n = rows;  
            for (int j = 1; j<= n - i; j++)   
            {  
                System.out.print(" ");   
            }   
            for (int k = i; k >= 1; k--)  
            {  
                System.out.print(k);  
            }  
            for (int l = 2; l <= i; l++)  
            {  
                System.out.print(l);  
            }  
            System.out.println();  
        }   
    }  

            

}
