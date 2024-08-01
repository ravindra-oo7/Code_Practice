package Searching.MajorityElement;

public class FindMajorityElementInArray {
    public static void main(String[] args) 
    {
        //int[] arr = {8,3,4,8,8}; // ans = 8
        //int[] arr = {20,30,40,50,50,50,50}; // ans= 50
        int[] arr = {3,7,4,7,7,5}; // ans = No Majority

        int len = arr.length;
        
        // Approch-01
        for(int i=0;i<len;i++)
        {
            int count = 0;
            for(int j=i;j<len;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>len/2)
            {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("No Majority!!!");
    }
}
