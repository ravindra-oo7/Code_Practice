package DSA_SearchingSortingAlgo.SortingAlgorithms.SelectionSort;

import java.util.Arrays;

public class SelectionSortForString {
    public static void main(String[] args) 
    {
        String[] arr = {"ravi","damaji","alok","rani","narendra","devyani","roshani"};
        System.out.println("Array : "+Arrays.toString(arr));

        // Approach-01
            int counter = 0;
            while(counter<arr.length) // 6 iterations
            {   
                for(int j=counter+1;j<arr.length;j++)
                {
                    if(arr[counter].compareTo(arr[j])>0)
                    {
                        String temp = arr[j];
                        arr[j] = arr[counter];
                        arr[counter] = temp; 
                    }
                }

                counter++;
                
            }

            System.out.println("Sorted Array:"+Arrays.toString(arr));
   
    
    }
}
