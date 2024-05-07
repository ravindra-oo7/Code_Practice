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
/* 
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
 */

 //------------------------------------------------------------------------------------

 //Left Pascal's Triangle
/* 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows : ");
        int row = sc.nextInt();
    
        for(int i=0;i<row;i++)
        {
            for(int j=row-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<row-1;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=row-1;k>i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        
        }
    }    
*/    
//------------------------------------------------------------------------------------

 //Sandglass star pattern
/* 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows : ");
        int row = sc.nextInt();
        int count;

        for (int i=0;i<row;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(count=i;count<row;count++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=0;i<row;i++)
        {
            for(int j=row-1;j>i;j--)
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

 //Triangular star pattern
 /* 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Odd number to print Traingle : ");
        int base = sc.nextInt();

        for(int i=0;i<base/2;i++)
        {
            for(int j=0;j<base;j++)
            {
                if(j==((base/2)-i) || j==((base/2)+i) )
                {
                    System.out.print("*");
                }   
                else{
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
        for(int i=0;i<base;i++)
        {
            System.out.print("*");
        }
    }    
 */

// Triangle Star pattern from JavaTpoint
/* 
    public static void main(String[] args)  
    {  
        int i, j, k, rows=3;  
        for (i=1; i<= rows ; i++)  
        {  
            for (j = i; j < rows ; j++)   
            {  
                 System.out.print(" ");  
            } 

            for (k = 1; k <= (2*i -1) ;k++)   
            {  
                if(k==1 || i == rows || k==(2*i-1))   
                {  
                    System.out.print("*");  
                }  
                else   
                {  
                    System.out.print(" ");  
                }  
            }  
            System.out.println("");  
        }  
    } 
*/ 



} 



