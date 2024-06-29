package Arrays.RemoveDuplicateElements;

import java.util.Arrays;

public class RemoveDuplicateElements {
    public static void main(String[] args) 
    {
        int[] intArr = {1,2,2,3,3,4};
        System.out.println("Orignal Array : "+Arrays.toString(intArr));
        System.out.println("Size : "+intArr.length);

        // Approach-01
        int [] processedArr = Arrays.stream(intArr)
                .distinct()
                .toArray();

        System.out.println("Proccesed Array : "+Arrays.toString(processedArr));
        System.out.println("Size : "+processedArr.length);
        
    }
}
