package StringCodes.O17SwapTwoStrings;

public class SwapTwoString {
    public static void main(String[] args) 
    {
        //Initial String
        String str1 = "Ravindra";
        String str2 = "Shende";

/*         
    //Using Temporary variable
        System.out.println("Using Temp variable : ");
        System.out.println("Before swap : ");
        System.out.println("str1 = "+str1);
        System.err.println("str2 = "+str2);
        
        String temp = str1;
        str1=str2;
        str2=temp;

        System.out.println("After swap : ");
        System.out.println("str1 = "+str1);
        System.err.println("str2 = "+str2);
*/
    //Without Using temp variable
        System.out.println("Without Using Temp variable : ");
        System.out.println("Before swap : ");
        System.out.println("str1 = "+str1);
        System.err.println("str2 = "+str2);

        str1=str1+str2;
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("After swap : ");
        System.out.println("str1 = "+str1);
        System.err.println("str2 = "+str2);

    }
}
