package SortingAlgorithms.ArraysSortMethod.SortWrapperType;

import java.util.Arrays;
import java.util.Collections;

public class SortWrapperType {
    public static void main(String[] args) 
    {
        Integer[] arr = {1,5,2,6,4,9,3};
        
        //Arrays.sort(arr); // Accending Order
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
