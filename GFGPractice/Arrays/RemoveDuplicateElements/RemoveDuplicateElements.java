package Arrays.RemoveDuplicateElements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {
    public static void main(String[] args) 
    {
        int[] intArr = {1,2,2,3,3,4};
        System.out.println("Orignal Array : "+Arrays.toString(intArr));
        System.out.println("Size : "+intArr.length);

/*         
        // Approach-01
        int [] processedArr = Arrays.stream(intArr)
                .distinct()
                .toArray();

        System.out.println("Proccesed Array : "+Arrays.toString(processedArr));
        System.out.println("Size : "+processedArr.length);
*/

/* 
        // Approach-02
        Set <Integer> intSet = new HashSet<>();
        for (int i=0;i<intArr.length;i++)
        {
                intSet.add(intArr[i]);
        }
        
        Integer[] newArr = intSet.toArray(new Integer[0]);

        System.out.println("Processed Array : " + Arrays.toString(newArr));
        System.out.println("Size : " + newArr.length);
*/

        // Approch-03
        int[] processedArr = Arrays.stream(intArr)
                                .distinct()
                                .toArray();
        // Resize the original array
        intArr = new int[processedArr.length];
        System.arraycopy(processedArr, 0, intArr, 0, intArr.length);

        System.out.println("Array After Process : "+Arrays.toString(intArr));
        System.out.println("Size : "+intArr.length);

    }
}
