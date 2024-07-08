package Arrays.MajorityElement;

import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) 
    {

        int[] arr = {8,3,4,8,8};
        //int[] arr = {3,7,4,7,7,5};
        //int[] arr = {2,3,4,5,5,5,5};

        // Approach-01
        int majEle =Integer.MIN_VALUE; ;
        Map <Integer,Integer> arrMap = new LinkedHashMap<>();

        for(int i=0; i<arr.length ;i++)
        {
            arrMap.put(arr[i], arrMap.getOrDefault(arr[i], 0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : arrMap.entrySet()) 
        {
           if(entry.getValue()>=(arr.length/2)+1)
           {
                majEle = entry.getKey();
           }

           System.out.println(entry.getKey()+" : "+ entry.getValue() );
        }

        if(majEle != Integer.MIN_VALUE)
        {
            System.out.println("Majority Element Present : "+majEle);
            System.out.print("Indexs are : ");
            for(int k=0;k<arr.length;k++)
            {
                if(arr[k]==majEle)
                {
                    System.out.print(k+" ,");
                }
            }

        }

    }
}

//        for(int i=1; i<(arr.length/2)+1 ;i++)
