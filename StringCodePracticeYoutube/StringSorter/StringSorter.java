package StringSorter;
import java.util.Scanner;

public class StringSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String strOrignal = sc.next();

        //Approach-01
        char[] charArray = strOrignal.toCharArray();

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
        
    }

}
