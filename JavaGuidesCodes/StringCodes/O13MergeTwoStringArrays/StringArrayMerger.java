package StringCodes.O13MergeTwoStringArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringArrayMerger {
    public static void main(String[] args) 
    {
        String [] str1= {"My","Name","Is"};
        String [] str2 = {"Ravindra","Shende"};

        //Approach-01
        StringBuilder strBD = new StringBuilder();
  
        for (String string : str1) 
        {
            strBD.append(string)
                    .append(" ");
        }
        for (String string : str2) 
        {
            strBD.append(string)
                    .append(" ");
        }

        String [] finalArr = strBD.toString().split("\\s");
        System.out.println(Arrays.toString(finalArr));
    }
}
