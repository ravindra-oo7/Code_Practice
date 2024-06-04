package Java8Codes.O06PrintEvenNumbFromList;

import java.util.Arrays;
import java.util.List;

public class PrintEvenNumbOnly {
    public static void main(String[] args) 
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

/* 
        //Approach-01
        for (Integer integer : numbers) 
        {
            if(integer%2==0)
            {
                System.out.print(integer+", ");
            }
        }
*/
        //Approach-02
        System.out.print("Even Numbers : ");
        numbers.stream()
                .filter(n->n%2==0)
                .forEach(n->System.out.print(n+", "));

    }
}
