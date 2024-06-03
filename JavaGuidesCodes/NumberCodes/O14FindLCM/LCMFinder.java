package NumberCodes.O14FindLCM;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LCMFinder {
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter numb1 : ");
        int numb1= sc.nextInt();
        System.out.print("Enter numb2 : ");
        int numb2= sc.nextInt();

        //Approach-01
        int min = Math.min(numb1, numb2);
        int max = Math.max(numb1,numb2);
        Set<Integer> numbTable = new LinkedHashSet<>();
        for(int i=1;i<10000;i++)
        {
            numbTable.add(i*min);
        }

        for(int i=1;i<10000;i++)
        {
            if(!numbTable.add(i*max))
            {
                System.out.println("LCM of "+min+" and "+max+ " : "+ i*max);
                break;
            }
        }

    }
}
