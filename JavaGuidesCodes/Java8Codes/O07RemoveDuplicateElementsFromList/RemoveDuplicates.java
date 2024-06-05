package Java8Codes.O07RemoveDuplicateElementsFromList;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) 
    {
        List<Integer> numbersWithDuplicates = Arrays.asList(13, 4, 4, 5, 6, 7, 7, 8, 9);
        System.out.print("List : ");
        numbersWithDuplicates.stream().forEach(n->System.out.print(n+", "));
      
      
        //Approach-01
        Set<Integer> intSet = new LinkedHashSet<>();

        for (Integer integer : numbersWithDuplicates) 
        {
            intSet.add(integer);
        }

        System.out.print("After Removing Duplicates : ");
        intSet.stream()
                .forEach(n->System.out.print(n+", "));

    }
}
