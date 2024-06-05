package Java8Codes.O09ReverseEachWordOfString;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReverseEachWordOfString {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

/*         
        //Approach-01
        String[] strArr = str.split("\\s+");

        for (int i=0;i<strArr.length;i++) 
        {
            String string = strArr[i];

            for (int j=string.length()-1;j>=0;j--) 
            {
                System.out.print(string.charAt(j));
            }   

            System.out.print(" "); 
        }
*/

        //Approach-02
        String result = Arrays.stream(str.split("\\s+"))
                                .map(word-> new StringBuilder(word).reverse())
                                .collect(Collectors.joining(" "));

        System.out.println("Reversed Words : "+ result);

    }
}
