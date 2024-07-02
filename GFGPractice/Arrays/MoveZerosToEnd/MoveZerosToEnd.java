package Arrays.MoveZerosToEnd;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) 
    {
        int[] intArr = {4,2,3,2,0,2,0,5,0}; 
        System.out.println("Array Before : "+Arrays.toString(intArr));

/*         
        // Approach-01
        int count = 0;
        int j = 0;
        int[] newArr = new int[intArr.length]; 
        for(int i=0;i<intArr.length;i++)
        {
            if(intArr[i]==0)
            {
                count++;
            }
            else
            {
                newArr[j]=intArr[i];
                j++;
            }
        }

        System.err.println("Array After Process : "+Arrays.toString(newArr));
*/

        // Approach-02
        for(int i=0;i<intArr.length;i++)
        {
            if(intArr[i]==0)
            {
                for(int j=i+1;j<intArr.length;j++ )
                {
                    if(intArr[j]!=0)
                    {
                        int temp = intArr[i];
                        intArr[i] = intArr[j];
                        intArr[j] = temp;
                    }
                }
            }
        }
        System.err.println("Array After Process : "+Arrays.toString(intArr));

    }

   
}
