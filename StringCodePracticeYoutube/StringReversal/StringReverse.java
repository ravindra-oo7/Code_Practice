package StringReversal;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String strOrignal = sc.next();
 
    /*   //Aproach-01
        StringBuilder strNew = new StringBuilder();
        
        for (int i=strOrignal.length()-1;i>=0;i--) 
        {
            strNew.append(strOrignal.charAt(i));    
        }
        System.out.println(strNew);
    */
    
    /* 
        //Aproach-02
        char[] charArray = strOrignal.toCharArray(); 

        for (int i=charArray.length-1;i>=0;i--) 
        {
            System.out.print(charArray[i]+" ");
        }
    */

    /* 
        //Aproach-03
        StringBuffer strBuffer = new StringBuffer(strOrignal);
        strBuffer.reverse();
        System.out.println(strBuffer);
    */

        //Aproach-04
        StringBuilder strBuilder = new StringBuilder(strOrignal);
        System.out.println(strBuilder.reverse());
    }        
}
