package Java8Codes.O02MaxMinNumbInList;

import java.util.Arrays;
import java.util.List;

public class MaxMinNumbInList {
    public static void main(String[] args) 
    {
        // Creating a list of integers
        List<Integer> numbList = Arrays.asList(12, 23, 3, 434, 52, 6, 74, 83, 92, 10);

        
        //Approach-01
        int maxnumb=0;
        int minnumb=numbList.get(0);
        for (Integer integer : numbList) 
        {
            if(integer>maxnumb)
            {
                maxnumb = integer;
            }

            if(integer<minnumb)
            {
                minnumb=integer;
            }
        }
        System.out.println("Max Numb : "+maxnumb);
        System.out.println("Min Numb : "+minnumb);



    }
}
