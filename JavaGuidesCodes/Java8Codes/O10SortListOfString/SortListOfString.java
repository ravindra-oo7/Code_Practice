package Java8Codes.O10SortListOfString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOfString {
    public static void main(String[] args) 
    {
        List<String> strList = Arrays.asList("Banana", "Apple", "Orange", "Mango", "Grape");

        //Approach-01
        strList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1,String s2)
            {
                return s1.compareTo(s2);
            }
        });
        System.out.println("Sorted list : "+strList);
    }
}
