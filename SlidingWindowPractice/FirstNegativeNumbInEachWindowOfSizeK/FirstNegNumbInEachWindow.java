package FirstNegativeNumbInEachWindowOfSizeK;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class FirstNegNumbInEachWindow {
    public static void main(String[] args) 
    {
        int[] arr = {12,-1,-7,8,-15,30,16,28};
        System.out.println("Array : "+Arrays.toString(arr));
        
        int len = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SubArray Size : ");
        int k = sc.nextInt();

/*         
        // Approach-01

        for(int i=0;i<=len-k;i++) //len=8 k=3 =>5
        {
            for(int j=i;j<i+k;j++) //
            {
                if(arr[j]<0)
                {
                    System.out.print(arr[j]+"  ");
                    break; 
                }
                else if(j==(i+k-1))
                {
                    System.out.print(0+"  ");
                }
            }
        }
*/

        // Approach-02

        List<Integer> window = new LinkedList<>();         

        for(int j=0;j<=len;j++)
        {
            if(window.size()<k)
            {
                window.add(arr[j]);
            }
            else
            {
                int i = 0;
                boolean isPresent = false;

                while (i<k) 
                {
                    if(window.get(i)<0)
                    {
                        isPresent=true;
                        System.out.print(window.get(i)+" ");
                        window.remove(0);
                        break;
                    }
                    else
                    {
                        i++;
                    }    
                }

                if(!isPresent)
                {
                    System.out.print(0+" ");
                    window.remove(0);
                }

                if(j<len && window.size()<k)
                {
                    window.add(arr[j]);
                }
            }
        }

        


    }
}
