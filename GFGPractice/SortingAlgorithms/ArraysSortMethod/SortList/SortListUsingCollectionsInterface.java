package SortingAlgorithms.ArraysSortMethod.SortList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortListUsingCollectionsInterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,6,4,2,9,7,2,0));

        Collections.sort(list);

        for (Integer ele: list) 
        {
            System.out.print(ele+" ");    
        }
    }
}
