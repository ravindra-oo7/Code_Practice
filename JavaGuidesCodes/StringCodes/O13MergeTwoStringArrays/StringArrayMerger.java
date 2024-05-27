package StringCodes.O13MergeTwoStringArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringArrayMerger {
    public static void main(String[] args) 
    {
        String [] str1= {"My","Name","Is"};
        String [] str2 = {"Ravindra","Shende"};

/* 
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
*/

/* 
        //Approach-02
        String [] finalArr = new String[str1.length+str2.length];

        for (int i=0;i<finalArr.length;i++) 
        {
            if(i<str1.length)
            {
                finalArr[i]=str1[i];
            }
            else
            {
                finalArr[i]=str2[i-str1.length];
            }
        }
        System.out.println(Arrays.toString(finalArr));
*/

        //Approach-03
        String [] finalArr = new String[str1.length+str2.length];

        System.arraycopy(str1, 0, finalArr, 0, str1.length);

        System.arraycopy(str2, 0, finalArr, str1.length, str2.length);

        System.out.println(Arrays.toString(finalArr));

    }
}
