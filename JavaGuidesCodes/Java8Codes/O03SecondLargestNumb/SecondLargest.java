package Java8Codes.O03SecondLargestNumb;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SecondLargest {
    public static void main(String[] args) 
    {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 6, 6, 7, 2); 

        //Approach-01
        int highest = 0;
        int secondHigh =0;
        for (Integer integer : numbers) 
        {
            if(integer>highest)
            {
                highest=integer;
            }
        }
        for (Integer integer : numbers) 
        {
            if(integer>secondHigh && integer<highest)
            {
                secondHigh = integer;
            }
        }
        
        System.out.println("Highest Element : "+highest);
        System.out.println("Second Highest Element : "+secondHigh);

    }
}
