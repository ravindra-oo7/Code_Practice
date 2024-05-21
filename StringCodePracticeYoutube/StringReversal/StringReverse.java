package StringReversal;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String strOrignal = sc.next();
        StringBuilder strNew = new StringBuilder();


       // char[] charArray = strOrignal.toCharArray();   
        // for (char e : charArray) {
        //     System.out.print(e+" ");
        // }

         for (int i=strOrignal.length()-1;i>=0;i--) 
         {
            strNew.append(strOrignal.charAt(i));    
         }
         System.out.println(strNew);

    }
}
