package BitMagic.CountSetBits;

import java.util.Scanner;

public class CountSetBit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter Number : ");
        int numb = sc.nextInt();

/*         
        // Approach-01
        int counter=0;
        while(numb>0)        
        {
            if ((numb & 1)==1) 
            {
                counter++;
            }
            
            numb = numb>>1;
        }
        
        System.out.println("Count : "+counter);
*/

/* 
        // Approach-02
        int counter = 0;
        while(numb>0)
        {
            if( numb%2 !=0)
            {
                counter++;
            }
            numb = numb/2;
        }
        System.out.println("Count : "+counter);
*/

/* 
        // Approch-03
        int counter = 0;
        while(numb>0)
        {
            if( numb%2 !=0)
            {
                counter=counter+(numb&1);
            }
            numb = numb>>1;
        }
        System.out.println("Count : "+counter);
*/
/* 
        // Approach-04
        int counter = 0;
        while(numb>0)
        {
            numb=(numb&(numb-1));
            counter++;
        }
        System.out.println("Count : "+counter);
*/
        // Approach-05
        int[] table = new int[256];
        table[0]=0;
        for(int i=0;i<256;i++)
        {
            table[i]=(i&1)+table[i/2];
        }

        int res = table[numb & 0xff];
        numb = numb>>8;

        res = res + table[numb & 0xff];
        numb = numb>>8;

        res = res + table[numb & 0xff];
        numb = numb>>8;

        res = res + table[numb & 0xff];

         System.out.println(res);
    }
}
