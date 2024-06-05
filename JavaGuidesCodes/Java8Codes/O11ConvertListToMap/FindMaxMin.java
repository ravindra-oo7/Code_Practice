package Java8Codes.O11ConvertListToMap;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class FindMaxMin {
    public static void main(String[] args) 
    {
        List<Integer> numbers = Arrays.asList(2, 4, 7, 5, 9, 10, 3, 1);

       OptionalInt max =  numbers.stream()
                                    .mapToInt(n->(int)n)
                                    .max();
       OptionalInt min =  numbers.stream()
                                    .mapToInt(n->(int)n)
                                    .min();

    //    System.out.println("Max : "+max);                             
    //    System.out.println("Min : "+min);
    
        max.ifPresent(value->System.out.println("Max : "+value));
        min.ifPresent(value->System.out.println("Min : "+value));

    }
}
