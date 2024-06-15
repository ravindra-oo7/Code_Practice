package BitMagic.IsPowerOfTwo;

import java.util.Scanner;

public class IsPowerOfTwo {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

/*         
        //Approach-01
        int counter = 2;
        while (counter<numb) 
        {
            counter=counter*2;
        } 
        if(counter==numb)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
*/

/* 
        //Approch-02
        // boolean flag =true;
        int comparer=1;
        while(comparer<numb)
        {
            comparer = comparer<<1;
            if(comparer == numb )
            {
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
*/
/* 
        // Approch-03
        boolean flag = true;
        if(numb<2)
        {
            System.out.println("No");
            System.exit(0);
        }
        while(numb!=1)
        {
           if (numb%2!=0)
           {
                flag=false;
                break;
           }
           numb/=2;
        }
        if(flag)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
*/

/* 
        // Approach-04
        boolean flag=false;

        if((numb&(numb-1))==0)
            flag=true;
        if(numb<2)
            flag=false;

        if(flag)
        {
             System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
*/

        // Approach-05
        boolean flag=false;

        if((numb>1)&&((numb&(numb-1))==0))
        {
            flag =true;
        }
    
        if(flag)
        {
             System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}
