package Arrays.CheckIfArrayIsSorted;

import java.util.Arrays;

public class IsSorted {
    public static void main(String[] args) 
    {
        int[] intArr = {10};
        System.out.println("Array : "+Arrays.toString(intArr));

        if(intArr.length<2)
        {
            System.out.println("Array is Small Hence Already Sorted ");
            System.exit(0);
        }

        boolean flag = true;
        if(intArr[0]<intArr[1])
        {
            for(int i=1;i<intArr.length-1;i++)
            {
               if(intArr[i]>intArr[i+1])
               {
                    flag = false; 
                    break;
               }
    
            }
        }
        else
        {
            for(int i=1;i<intArr.length-1;i++)
            {
               if(intArr[i]<intArr[i+1])
               {
                    flag = false; 
                    break;
               }
    
            }
        }

        if(flag)
        {
            System.out.println("Array is Sorted");
        }
        else
        {
            System.out.println("Array is Not Sorted !!");
        }

    }
}
