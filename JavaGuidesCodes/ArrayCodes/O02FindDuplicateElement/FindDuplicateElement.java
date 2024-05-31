package ArrayCodes.O02FindDuplicateElement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateElement {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int arrSize = sc.nextInt();
        
        int[] arrInt = new int[arrSize];    

        for(int i=0;i<arrInt.length;i++)
        {   
            System.out.print("Enter "+ (i+1)+"Element : ");
            arrInt[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arrInt));

        //Approach-01
        Set<Integer> intSet = new LinkedHashSet<>(); 

        for (int i=0;i<arrInt.length-1;i++)
        {
            for(int j=i+1;j<arrInt.length;j++)
            {
                if(arrInt[i]==arrInt[j])
                {
                    intSet.add(arrInt[i]);
                }
            }
        }
        
        System.out.println("Duplicate Elements : "+intSet);

        
    }
}
