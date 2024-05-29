package StringCodes.O18CheckIfContainsOnlyDigits;

import java.beans.Transient;

public class IsNumericExample {
    
    private static boolean isEmpty(final CharSequence cs)
    {
        return cs ==null || cs.length()==0;
    }

    private static boolean isNumeric(final CharSequence cs)
    {
        if(isEmpty(cs))
        {
            return false;
        }

        for(int i=0;i<cs.length();i++)
        {
            if(!Character.isDigit(cs.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        if(isEmpty("1321"))
        {
            System.out.println("Empty");
        }
        else
        {
            System.out.println("Not Empty!!!");
        }

        if(isNumeric("1321"))
        {
            System.out.println("Numeric");
        }
        else
        {
            System.out.println("Not Numeric!!!");
        }
    }

}
