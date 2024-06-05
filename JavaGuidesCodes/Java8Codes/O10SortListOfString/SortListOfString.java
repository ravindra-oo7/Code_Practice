package Java8Codes.O10SortListOfString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfString {
    public static void main(String[] args) 
    {
        List<String> strList = Arrays.asList("Banana", "Apple", "Orange", "Mango", "Grape");
        System.out.println("\nList : "+strList);
/*         
        //Approach-01
        strList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1,String s2)
            {
                return s1.compareTo(s2);
            }
        });
        System.out.println("Sorted list : "+strList);
*/
        //Approach-02
        List<String> sortedStrings = strList.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nSorted list : "+sortedStrings);

    }
}
