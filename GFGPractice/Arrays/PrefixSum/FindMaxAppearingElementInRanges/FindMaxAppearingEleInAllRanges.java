package Arrays.PrefixSum.FindMaxAppearingElementInRanges;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindMaxAppearingEleInAllRanges 
{
    public static void main(String[] args) 
    {
        int[] left = {1,2,5,15};
        int[] right = {5,8,7,18};     

        int len = left.length;

        // Approach-01
        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<len;i++)
        {
            for(int j=left[i]; j<=right[i]; j++)
            {
                map.put(j,(map.getOrDefault(j,0)+1));
            }
        }
        
        int max = 0;
        int result=0;
        for(Map.Entry<Integer,Integer>entry : map.entrySet())
        {
            
            //System.out.println("K : "+entry.getKey()+"|| V : "+entry.getValue());

            if(entry.getValue()>max)
            {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        System.out.println("Result : "+result);
    }    
}
