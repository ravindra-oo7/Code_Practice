import java.util.Scanner;

public class StarPattern1 {

/*     
//Left Triangular Pattern

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows : ");
        int row = sc.nextInt();
        
        for(int i=0;i<row;i++)
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

/* 
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int row = sc.nextInt();

        for(int i=0;i<row;i++)
        {
            for(int j=row-i;j>=0;j--)
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
  */   


/*     
    //JavaTpoint code
    public static void main(String args[])   
    {    

        int i, j, row = 6;       
        for (i=0; i<row; i++)   
        {  
            //inner loop work for space      
            for (j=2*(row-i); j>=0; j--)         
            {  
                //prints space between two stars      
                System.out.print(" ");   
            }   
            //inner loop for columns  
            for (j=0; j<=i; j++ )   
            {   
                //prints star      
                System.out.print("* ");   
            }   

            System.out.println();   
        }   
    }   
 */
//----------------------------------------------------------------------------------------------------------------------------

/* 
//Pyramid Star pattern
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows : ");
        int row = sc.nextInt();

        for(int i=0;i<row;i++)
        {
            for(int j=row-i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 

 */
//------------------------------------------------------------------------------------
/* 
//Diamond pattern

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows : ");
        int row = sc.nextInt();

        for(int i=0;i<row;i++)
        {
            for(int j=row-i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=row-1;i>0;i--)
        {
            for(int j=i-1;j<=row;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>0;k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 

*/
//------------------------------------------------------------------------------------

/* 

//Downword Triangle Star pattern
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows : ");
        int row = sc.nextInt();
        
        for (int i = 0; i <row; i++) 
        {
            for(int j=row;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }     
 */
/*   
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter Rows : ");
        int row = sc.nextInt();
    
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("  ");
            }
    
            for(int j=row;j>i;j--)
            {
                System.out.print("* ");
            }
            System.err.println();
        }

    }    
*/

//------------------------------------------------------------------------------------

//Reverse Pyramid Star Pattern
 
/* 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows : ");
        int row = sc.nextInt();

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }

            for(int j=row;j>i;j--)
            {
                System.out.print("* ");
            }
            System.err.println();
        }
    } 
 */

 //------------------------------------------------------------------------------------

 //Right Pascal's Triangle

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows : ");
        int row = sc.nextInt();
        int count ;

        for(count=0;count<row;count++)
        {
            for(int j=0;j<=count;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(;count-1>0;count--)
        {
            for(int k=count-1;k>0;k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


        
    


} 



