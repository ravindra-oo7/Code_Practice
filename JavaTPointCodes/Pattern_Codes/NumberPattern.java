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
/* 
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
 */

//------------------------------------------------------------------------------
 
//Pattern 05
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
                System.out.print(i+1 +" ");
            }
            System.out.println();
        }
    }
*/

//------------------------------------------------------------------------------
 
//Pattern 06
 /* 
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        for(int i=rows;i>0;i--)
        {
            for(int j=rows;j>=i;j--)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
 */

//---------------------------------------------------------------------------------------
//Pattern 07
/* 
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
 */ 

//---------------------------------------------------------------------------------------
//Pattern 08

/* 
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();
        boolean flag=true;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<rows;j++)
            {
              if(flag){
                System.out.print("1");
                flag=false;
              }
              else{
                System.out.print("0");
                flag=true;
              }   
            }
            System.out.println();
        }
    }
*/

//---------------------------------------------------------------------------------------
//Pattern 09
/*  
public static void main(String[] args)   
{  
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Rows : ");
    int rows = sc.nextInt();
    boolean flag=true;  

    for(int i=0;i<rows;i++)
    {
        flag=true;
        for(int j=0;j<=i;j++)
        {
            if(flag){
                System.out.print("1");
                flag=false;
            }
            else{
                System.out.print("0");
                flag=true;
            }
        }
        System.out.println();
    }

}      
*/

//---------------------------------------------------------------------------------------
//Pattern 10
/*  
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=rows;j++)
            {
                System.out.print(" "+j);
            }

            System.out.println();
        }

        for(int i=1;i<rows;i++)
        {
            for(int j=i;j<rows;j++)
            {
                System.out.print(" ");
            }
             for(int j=rows-i;j<=rows;j++)
             {
                 System.out.print(" "+j);
             }

            System.out.println();
        }
    }
 */   
 //---------------------------------------------------------------------------------------
//Pattern 11
/*  
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        for (int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        } 

        for(int i=rows;i>0;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
 */

//---------------------------------------------------------------------------------------
//Pattern 12
/*  
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        for(int i=0;i<rows;i++)
        {
            for(int j=rows;j>i;j--)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }

    }
 */  

 //---------------------------------------------------------------------------------------
//Pattern 13
/*  
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        for(int i=rows;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }

    }
 */  
//---------------------------------------------------------------------------------------
//Pattern 14
/*  
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        for(int i=rows;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }

    }  
 */   
//---------------------------------------------------------------------------------------
//Pattern 15
 /* 
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();
        int count,j;

        System.out.println("1");
        for(int i=2;i<=rows;i++)
        {
            count=1;
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
                count=j;
            }
            if(count==i)
            {
                for(int k=j-2;k>0;k--)
                {
                    System.out.print(k+" ");
                } 
            }
            System.out.println();
        }
        
    }
*/

//---------------------------------------------------------------------------------------
//Pattern 16
/*  
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        for(int i=rows;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(j+1+" ");

            }
            System.out.println();
        }

        for(int i=2;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
 */
//---------------------------------------------------------------------------------------
//Pattern 17
/*  
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=rows;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }

        for(int i=1;i<rows;i++)
        {
            for(int j=rows-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=rows-i;j<=rows;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
 */

//---------------------------------------------------------------------------------------
//Pattern 18
 /* 
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();
        int count;

        for(int i=1;i<=rows;i++)
        { 
            for(int j=rows;j>i;j--)
            {
                System.out.print("1");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }

            System.out.println();
        }
    } 
*/
//---------------------------------------------------------------------------------------
//Pattern 19
/*  
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();
        int count;

        for(int i=1;i<=rows;i++)
        {
            System.out.print(i+" ");
            count=rows-1;
            
            int k=i;
            for(int j=2;j<=i;j++)
            {
                k=k+count;
                System.out.print(k+" ");
                count--;
            }
            System.out.println();
        }
    }
 */   
//---------------------------------------------------------------------------------------
//Pattern 20
/* 
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int j=i;j<=rows;j++)
            {
                System.out.print(j+" ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
 */
//---------------------------------------------------------------------------------------
//Pattern 21
/* 
    public static void main(String[] args)    
    {   
        int i, j, min;
        Scanner sc= new Scanner(System.in);  
        System.out.print("Enter rows : ");  
         int  rows=sc.nextInt();  

        //loo for upper left part  
        for (i = 1; i <= rows; i++)    
        {   
            for (j = 1; j <= rows; j++)   
            {   
                min = i < j ? i : j;   
                System.out.print(rows - min + 1+ " ");   
            }  

            //loop for upper right part  
            for (j = rows - 1; j >= 1; j--)   
            {   
                min = i < j ? i : j;   
                System.out.print(rows - min + 1+ " ");   
            }   
             System.out.println();   
        } 

        //loop for lower left part  
        for (i = rows - 1; i >= 1; i--)    
        {   
            for (j = 1; j <= rows; j++)    
            {   
                min = i < j ? i : j;   
                System.out.print(rows - min + 1+ " ");   
            }  

            //loop for lower right part  
            for (j = rows - 1; j >= 1; j--)    
            {   
                min = i < j ? i : j;   
                System.out.print(rows - min + 1+ " ");   
            }   
            System.out.println();   
        }   
           
    }   
 */    
}
