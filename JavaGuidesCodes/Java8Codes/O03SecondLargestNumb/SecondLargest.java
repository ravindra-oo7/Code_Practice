package Java8Codes.O03SecondLargestNumb;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;

public class SecondLargest {
    public static void main(String[] args) 
    {
        List<Integer> numbers = Arrays.asList(1, 9, 4, 5, 6, 6, 7, 2); 

/*         
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
*/

/* 
        //Approach-02
        Optional<Integer> secondLargest = numbers.stream()
                                                    .distinct()
                                                    .sorted(Comparator.reverseOrder())
                                                    .skip(1)
                                                    .findFirst();
        secondLargest.ifPresent(numb->System.out.println("Second Largest Number : "+numb));
 */

        //Approach-03
        Optional<Integer> secondLargest = numbers.stream()
                                            .distinct()
                                            .sorted()
                                            .skip(numbers.stream().distinct().count()-2)
                                            .findFirst();
                                                
        secondLargest.ifPresent(s->System.out.println("Second Largest : "+s));
    }
}
