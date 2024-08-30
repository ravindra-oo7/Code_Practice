package DSA_SearchingSortingAlgo.SearchingAlgorithm.LinearSearch;

import java.util.Scanner;

public class LinearSearchString {
    public static void main(String[] args) 
    {
        String[] arr = {"ravi","narendra","alok","rani","damu","devyani","roshani"};
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Search String : ");
        String item = sc.next();

        for(int i=0;i<arr.length;i++)
        {
            if(item.equals(arr[i]))
            {
                System.out.println("String found at index "+i+" .");
                return;
            }
        }
        System.out.println("String Not Found!!!");
    }
}
