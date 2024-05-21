package RemoveWhiteSpace;
import java.lang.*;
import java.util.*;


public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter String : ");
        String strOrignal = sc.nextLine();

        //Approach01
        String strProccesed = strOrignal.replaceAll(" ","");
        System.out.println(strProccesed);

    }
}
