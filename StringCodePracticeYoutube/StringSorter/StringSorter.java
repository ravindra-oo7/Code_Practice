package StringSorter;
import java.util.Arrays;
import java.util.Scanner;

public class StringSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String strOrignal = sc.next();
        char[] charArray = strOrignal.toCharArray();

/*         
        //Approach-01 Without using sort Method

        for(int i=0;i<charArray.length-1;i++)
        {
            for(int j=i+1;j<charArray.length;j++)
            {
                if(charArray[j]<charArray[i])
                {
                    char temp = charArray[i];
                    charArray[i]=charArray[j];
                    charArray[j]=temp;
                }
            }
        }
        for(int i=0;i<charArray.length;i++)
        {
            System.out.print(charArray[i]);
        }
*/

        //Approach-02
        Arrays.sort(charArray);
        System.out.println(new String(charArray));

    }

}
