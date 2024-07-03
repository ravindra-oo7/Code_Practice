package Arrays.FrequenciesOfAllElementsInArray;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountElementsOccurance {
    public static void main(String[] args) 
    {
        int[] arr = {10,10,10,25,30,30,23};  
        System.out.println("Array : "+Arrays.toString(arr));


    // Approch-01
        Map <Integer,Integer> intMap = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            intMap.put(arr[i], intMap.getOrDefault(arr[i], 0)+1);
        }

        for (Map.Entry<Integer,Integer> entry:intMap.entrySet()) 
        {
            System.out.println("Element : "+entry.getKey()+" | Occurance : "+entry.getValue());
        }
    }

    
}
