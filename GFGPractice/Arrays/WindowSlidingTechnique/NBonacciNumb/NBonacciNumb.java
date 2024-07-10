package Arrays.WindowSlidingTechnique.NBonacciNumb;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NBonacciNumb {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter No of elements to Add : ");
        int n = sc.nextInt();

        System.out.print("Enter No to Print : ");
        int m = sc.nextInt();

    // Approach-01
        
        int sum = 0;
        int start = 0;

        List<Integer> list = new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(i!=n-1)
                list.add(0);
            else
                list.add(1);  
        }
        for (Integer integer : list) 
        {
            sum=sum+integer;    
        }

        for(int i=n;i<m;i++)
        {
            list.add(sum);
            sum = sum+(list.get(i)-list.get(start));
            start++;
        }
        System.out.println(list);

    }
}
