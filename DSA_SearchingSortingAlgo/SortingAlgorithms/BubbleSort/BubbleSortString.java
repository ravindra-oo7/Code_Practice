package DSA_SearchingSortingAlgo.SortingAlgorithms.BubbleSort;

import java.util.Arrays;

public class BubbleSortString {
    public static void main(String[] args) {
        
        String[] arr = {"ravi","damaji","alok","rani","narendra","devyani","roshani"};
        System.out.println("Array : "+Arrays.toString(arr));
        
        for(int i=arr.length-1;i>0;i--)
        {
            int flag = 0;
            for(int j=0;j<i;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    String temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = 1;
                }
            }
            if(flag == 0)
            {
                break;
            }
        }
        System.out.println("Sorted Array : "+Arrays.toString(arr));

    }

}
